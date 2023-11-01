import pandas as pd
from pandas_geojson import read_geojson
import requests


URL= "http://localhost:8000/"


def readingGeo():
    response = requests.get(URL + "map.geojson") 
    print(response.text)

def readingJson():
    response = requests.get(URL + "generated.json")
    print(response.text)

def readingTxt():
    response = requests.get(URL +"text.txt")
    print(response.text)

def readingCsv():
    response = requests.get(URL + "ratings.csv")
    print(response.text)

readingCsv()

##geo_json = read_geojson('map.geojson')
##geo_json