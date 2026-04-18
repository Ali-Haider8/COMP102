package L2;

/*
Example 3: Consider the following 2D array named temperatures:

|     | 0    | 1    | 2    | 3    | 4    | 5    | 6    |
|-----|------|------|------|------|------|------|------|
| 0   | 12.5 | 12.2 | 14.0 | 13.0 | 13.2 | 13.0 | 12.2 |
| 1   | 15.2 | 11.9 | 11.8 | 13.2 | 12.7 | 14.5 | 12.4 |
| 2   | 9.75 | 11.8 | 11.9 | 13.5 | 12.7 | 14.7 | 13.0 |
| 3   | 14.0 | 13.2 | 11.8 | 14.0 | 14.3 | 11.0 | 11.9 |

Perform the following:
1. Print out the value of highlighted indexes.
2. Print out the value of highlighted row.
3. Find out the maximum, minimum and average values.
*/

class Temperatures2DArray {

    static void main() {

        double[][] temperatures = {
                {12.5, 12.2, 14.0, 13.0, 13.2, 13.0, 12.2},
                {15.2, 11.9, 11.8, 13.2, 12.7, 14.5, 12.4},
                {9.75, 11.8, 11.9, 13.5, 12.7, 14.7, 13.0},
                {14.0, 13.2, 11.8, 14.0, 14.3, 11.0, 11.9}
        };
        double min, max, sum;
        min = temperatures[0][0]; // Assume the first item is the minimum
        max = temperatures[0][0]; // Assume the first item is the maximum
        sum = 0;

        System.out.println(temperatures[1][5]);

        for (int col = 0; col < temperatures[1].length; col++) {
            System.out.print(temperatures[1][col] + " ");
        }
        System.out.println();

        for (int row = 0; row < temperatures.length; row++) {
            for (int col = 0; col < temperatures[row].length; col++) {
                if (min > temperatures[row][col]) {
                    min = temperatures[row][col];
                }
                if (max < temperatures[row][col]) {
                    max = temperatures[row][col];
                }
                sum = sum + temperatures[row][col];
            }
        }

        System.out.println("The minimum value is: " + min);
        System.out.println("The maximum value is: " + max);
        System.out.println("The average value is: " + sum / temperatures.length);

    }
}