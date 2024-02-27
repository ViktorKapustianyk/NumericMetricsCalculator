# NumericMetricsCalculator

NumericMetricsCalculator is a command-line tool designed to efficiently compute statistical metrics from numerical data stored in a file. It is capable of finding the following values:

1. Maximum number in the file.
2. Minimum number in the file.
3. Median.
4. Arithmetic mean.

## Additional Information
- **Median**: If the number of elements in the set is even, the median should be calculated as the average of the two middle values. For example, in the set {1, 8, 14, 19}, the median will be 11 (because 0.5*(8+14)=11).
  
- **Number Sequence**: This refers to the order of numbers in the file, appearing one after another. Even randomly generated data sets may contain relatively long sequences. For instance, an increasing number sequence may look like this: -4390, -503, 3, 16, 5032.

## Usage
To use NumericMetricsCalculator, simply execute the program. For example:

- java -jar NumericMetricsCalculator-1.0-SNAPSHOT.jar

The program will ask for the path to a file with numerical data in .txt format. Provide the path to your file and press Enter.

## Usage Examples
This example will help better understand how the program works and what results you can expect from using it.

**Content of the file `data.txt`:**

10
20
30
40
50

**Expected Result:**

Maximum number: 50

Minimum number: 10

Median: 30

Arithmetic mean: 30.0
