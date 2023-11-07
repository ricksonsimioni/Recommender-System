import pandas as pd
from pandas_geojson import read_geojson
import requests
import config as cf
import os

from googlemaps import convert

from sklearn.feature_extraction.text import TfidfVectorizer
from sklearn.metrics.pairwise import cosine_similarity

def clean_data(x):
    if isinstance(x, list):
        return [str.lower(i.replace(" ", "")) for i in x]
    else:
        if isinstance(x, str):
            return str.lower(x.replace(" ", ""))
        else:
            return ''


def scikit_cosine(term1, term2):
    vectorizer= TfidfVectorizer(analyzer='char')
    sparse_matrix = vectorizer.fit_transform([term1] + [term2])
    cosine = cosine_similarity(sparse_matrix[0,:], sparse_matrix[1:, :])
    return cosine

def remove_nan_values(in_csv, out_csv):
    df = pd.read_csv(in_csv)
    df_new = df.dropna()
    df_new.to_csv(out_csv, index=False)

def check_file_tipe(file):
    filename, file_extension = os.path.splitext(file)
    return file_extension

def load_csv(path):
    return pd.read_csv(path)

def read_json_data():
    return

def readingGeo():
    response = requests.get(cf.URL + "map.geojson")
    print(response.text)

def readingJson():
    response = requests.get(cf.URL + "generated.json")
    print(response.text)

def readingTxt():
    response = requests.get(cf.URL + "text.txt")
    print(response.text)

def readingCsv():
    response = requests.get(cf.URL + "ratings.csv")
    print(response.text)


def distance_matrix(client,origins, destinations,
                    mode=None, language=None, avoid=None, units=None,
                    departure_time=None, arrival_time=None, transit_mode=None,
                    transit_routing_preference=None, traffic_model=None, region=None):
    params = {
        "origins": convert.location_list(origins),
        "destinations": convert.location_list(destinations)
    }

    if mode:
        # NOTE(broady): the mode parameter is not validated by the Maps API
        # server. Check here to prevent silent failures.
        if mode not in ["driving", "walking", "bicycling", "transit"]:
            raise ValueError("Invalid travel mode.")
        params["mode"] = mode

    if language:
        params["language"] = language

    if avoid:
        if avoid not in ["tolls", "highways", "ferries"]:
            raise ValueError("Invalid route restriction.")
        params["avoid"] = avoid

    if units:
        params["units"] = units

    if departure_time:
        params["departure_time"] = convert.time(departure_time)

    if arrival_time:
        params["arrival_time"] = convert.time(arrival_time)

    if departure_time and arrival_time:
        raise ValueError("Should not specify both departure_time and"
                         "arrival_time.")

    if transit_mode:
        params["transit_mode"] = convert.join_list("|", transit_mode)

    if transit_routing_preference:
        params["transit_routing_preference"] = transit_routing_preference

    if traffic_model:
        params["traffic_model"] = traffic_model

    if region:
        params["region"] = region
    #print(client._request("/maps/api/distancematrix/json", params))
    return client._request("/maps/api/distancematrix/json", params)

def weighted_rating(metadata):
    C = metadata['p_rating'].mean()
    m = metadata['count'].quantile(0.75)
    v = metadata['count']
    R = metadata['p_rating']
    # Calculation based on the Bayesian Rating Formula
    return (v/(v+m) * R) + (m/(m+v) * C)