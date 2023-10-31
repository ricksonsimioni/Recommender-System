import pandas as pd
from pandas_geojson import read_geojson


geo_json = read_geojson('map.geojson')
geo_json