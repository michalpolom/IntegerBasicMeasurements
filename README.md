# IntegerBasicMeasurements

A simple Java application that returns basic measurements of a given list of integers.

## Task description

Task description: The input is a long list of integers. Please write a small app that will output the list of distinct elements sorted in ascending order, plus the basic measurement information that contains the number of elements in the source, number of distinct elements, min and max value.

## How it works?

Run the application in console.

For examples:
```
java <path>\IntegersMeasurement.java 1 2 3 4 5 5 5
```
```
java <path>\IntegersMeasurement.java -10 500 4000
```

In the return you receive basic measurements.

For example for the first case:
```
1 2 3 4 5
count: 7
distinct: 5
min: 1
max: 5
```

When you pass a non-integer argument in return you recive
```
ERROR: At least one of the argument is not an Integer (min=-2147483648, max=2147483647)
```
