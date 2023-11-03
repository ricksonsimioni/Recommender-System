import pandas as pd

import os


def remove_nan_values(in_csv, out_csv):
    df = pd.read_csv(in_csv)
    df_new = df.dropna()
    df_new.to_csv(out_csv, index=False)

def check_file_tipe(file):
    filename, file_extension = os.path.splitext(file)
    return file_extension

def load_csv(path):
    return pd.read_csv(path)