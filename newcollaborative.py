import numpy as np
import pandas as pd
import scipy.sparse
from scipy.spatial.distance import correlation
import requests
import warnings

URL = "http://localhost:8000/"
warnings.simplefilter('ignore')

# Feature that comes from the domain
data = pd.DataFrame.from_dict(requests.get(URL + "data_collaborative.json").json())
placeInfo = pd.DataFrame.from_dict(requests.get(URL + 'data_content.json').json())

data = pd.merge(data, placeInfo, left_on='itemId', right_on="itemId")
userIds = data.userId
userIds2 = data[['userId']]

data.loc[0:10, ['userId']]
# Convert non-numeric values in the 'rating' column to NaN
data['rating'] = pd.to_numeric(data['rating'], errors='coerce')

# Calculate the mean rating, excluding NaN values
mean_rating = data['rating'].mean()

# Replace NaN values in the 'rating' column with the mean rating as a string
data['rating'] = data['rating'].fillna(mean_rating).astype(str)

data = pd.DataFrame.sort_values(data, ['userId', 'itemId'], ascending=[0, 1])
userItemRatingMatrix = pd.pivot_table(data, values='rating', index=['userId'], columns=['itemId'])
#print(data['rating'])

# Feature that comes from the configuration
def favoritePlace(activeUser, N):
    topPlace = pd.DataFrame.sort_values(data[data.userId == activeUser], ['rating'], ascending=[0])[:N]
    return list(topPlace.title)


# Feature that comes from the configuration
def similarity(user1, user2):
    try:
        if len(user1) == 0 or len(user2) == 0:
            return 0

        # Remove the mean value from each user's ratings
        user1 = np.array(user1) - np.nanmean(user1)
        user2 = np.array(user2) - np.nanmean(user2)

        # Find common non-zero rated items
        commonItemIds = [i for i in range(len(user1)) if user1[i] > 0 and user2[i] > 0]

        if not commonItemIds:
            #print("no common item id")
            return 0
        else:
            # Extract common ratings for the correlation calculation
            user1 = np.array([user1[i] for i in commonItemIds])
            user2 = np.array([user2[i] for i in commonItemIds])

            # Calculate the correlation between the two users
            correlation = np.corrcoef(user1, user2)[0, 1]
            #print(f"Similarity: {correlation}")

            return correlation if not np.isnan(correlation) else 0  # Handle NaN correlations

    except ZeroDivisionError:
        print("You can't divide by zero!")
        return None

# Feature that comes from the configuration
def nearestNeighbourRatings(activeUser, K):
    try:
        similarityMatrix = pd.DataFrame(index=userItemRatingMatrix.index, columns=['Similarity'])
        for user_id in userItemRatingMatrix.index:
            similarityMatrix.loc[user_id] = similarity(userItemRatingMatrix.loc[activeUser], userItemRatingMatrix.loc[user_id])
        similarityMatrix = pd.DataFrame.sort_values(similarityMatrix, ['Similarity'], ascending=[0])
        nearestNeighbours = similarityMatrix[:K]
        neighbourItemRatings = userItemRatingMatrix.loc[nearestNeighbours.index]
        predictItemRating = pd.DataFrame(index=userItemRatingMatrix.columns, columns=['Rating'])
        
        for i in userItemRatingMatrix.columns:
            predictedRating = 0
            for j in neighbourItemRatings.index:
                if userItemRatingMatrix.loc[j, i] > 0:
                    predictedRating += (userItemRatingMatrix.loc[j, i] - np.nanmean(userItemRatingMatrix.loc[j])) * nearestNeighbours.loc[j, 'Similarity']
            predictItemRating.loc[i, 'Rating'] = np.nanmean(userItemRatingMatrix.loc[activeUser]) + predictedRating
    except ZeroDivisionError:
        print("You can't divide by zero!")
    return predictItemRating



# Feature that comes from the configuration
def topNRecommendations(activeUser, N):
    try:
        predictItemRating = nearestNeighbourRatings(activeUser, 10)
        predictItemRating = predictItemRating.fillna(0)  # Fill missing predictions with 0
        topRecommendations = pd.DataFrame.sort_values(predictItemRating, ['Rating'], ascending=[0])[:N]
        topRecommendationTitles = placeInfo.loc[placeInfo.itemId.isin(topRecommendations.index)]
    except ZeroDivisionError:
        print("You can't divide by zero!")
    return list(topRecommendationTitles.title)

activeUser = int(input("Enter userid: "))
#print("The user's favorite places are: ")
#print(favoritePlace(activeUser, 5))
print("The recommended places for you are: ")
print(topNRecommendations(activeUser, 4))
print(activeUser)
