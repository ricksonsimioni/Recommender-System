import pandas as pd
from surprise import accuracy, Dataset, SVD, Reader, BaselineOnly
from surprise.model_selection import train_test_split
from surprise.model_selection import cross_validate
from surprise.model_selection import KFold
import utils as ut
import config as cf
import os


def preprocessing(data_orig, filtered_data):
    file_type = ut.check_file_tipe(data_orig)

    if file_type == '.csv':
        df_data = ut.load_csv(cf.PATH_DATA_COLL)
        ut.remove_nan_values(cf.PATH_DATA_COLL, filtered_data)


def cross_validation(input_data, algo):
    kf = KFold(n_splits=3)

    # We'll use the famous SVD algorithm.
    for trainset, testset in kf.split(input_data):
        # train and test algorithm.
        algo.fit(trainset)
        predictions = algo.test(testset)

        # Compute and print Root Mean Squared Error
        accuracy.rmse(predictions, verbose=True)


def evaluation_pipeline(input_data):
    file_path = input_data  # Replace this with the actual path to your CSV

    # Define the format of your CSV file.
    # For example, line_format='user item rating timestamp', sep=',', skip_lines=1 if the first line is a header
    reader = Reader(line_format='user item rating timestamp', sep=',', skip_lines=1)

    # Load the dataset from the CSV file
    data = Dataset.load_from_file(file_path, reader=reader)


   # sample random trainset and testset
    # test set is made of 25% of the ratings.
    trainset, testset = train_test_split(data, test_size=0.25)

    # We'll use the famous SVD algorithm.
    algo = SVD()

    # Train the algorithm on the trainset, and predict ratings for the testset
    algo.fit(trainset)
    predictions = algo.test(testset)

    # Then compute RMSE
    accuracy.rmse(predictions)


def evaluation_cross_fold(input_data, algo):
    file_path = input_data  # Replace this with the actual path to your CSV

    # Define the format of your CSV file.
    # For example, line_format='user item rating timestamp', sep=',', skip_lines=1 if the first line is a header
    reader = Reader(line_format='user item rating timestamp', sep=',', skip_lines=1)

    # Load the dataset from the CSV file
    data = Dataset.load_from_file(file_path, reader=reader)

   # sample random trainset and testset
    # test set is made of 25% of the ratings.


    # We'll use the famous SVD algorithm.


    # Train the algorithm on the trainset, and predict ratings for the testset
    cross_validate(algo, data, verbose=True)


if __name__ == '__main__':
    #preprocessing('data_collaborative.csv', 'data_filtered.csv')
    #evaluation_pipeline(input_data='data_filtered.csv')

    algo = SVD()
    evaluation_cross_fold(input_data='data_filtered.csv', algo=algo)