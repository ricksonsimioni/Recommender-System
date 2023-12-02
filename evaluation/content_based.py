import pandas as pd
import config as cf
from googlemaps import Client
import utils as ut


def preprocessing(data_orig, filtered_data):
    metadata = pd.read_csv('data_content.csv', low_memory=False)
    poi_category = cf.CATEGORIES[0]
    ratings = metadata['p_rating'].mean()
    count = metadata['count'].quantile(0.75)

    metadata['category'] = metadata['category'].apply(ut.clean_data)
    metadata['score'] = metadata.apply(ut.weighted_rating, axis=1)
    #print(metadata.head())
    cos = []
    for i in list(metadata['category']):
        cosine = ut.scikit_cosine(poi_category, i)
        if cosine > 0.0:
            cos.append(cosine)
    metadata['cosine'] = cos
    #x = metadata['cosine'] > 0.0
    rec=pd.DataFrame(metadata['cosine'])
    ranked_pois = rec.sort_values('score',ascending=False)
    return ranked_pois

def algorithm_settings(dest, client, src):
    dist = []
    dur = []

    for d in dest:
        d = d + cf.LOCATION
        #print(d)
        output = ut.distance_matrix(client,src,d)
        #print(output)
        a1 = (output['rows'][0]['elements'][0]['distance']['text'])
        a2 = (output['rows'][0]['elements'][0]['duration']['text'])
        dist.append(a1)
        dur.append(a2)

    return dist, dur


def run_validation():
    ranked_pois = preprocessing('data_content.csv', 'filtered_content.csv')
    src = input("Enter your location: ")
    # print(type(dest))
    client = Client(key=cf.GOOGLE_KEY)
    dist, dur = algorithm_settings(ranked_pois['title'], client, src)
    ranked_pois['distance'] = dist
    ranked_pois['duration'] = dur
    final = pd.DataFrame(ranked_pois, index=None, columns=['title', 'category', 'score', 'distance', 'duration'])
    print(final)

if __name__ == '__main__':
    run_validation()