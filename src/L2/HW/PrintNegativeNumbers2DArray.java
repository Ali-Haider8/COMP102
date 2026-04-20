package L2.HW;
/*
Q2> Write a Java program to print negative numbers in an 2D array.
*/

import java.util.Arrays;

class PrintNegativeNumbers2DArray {

    static void main() {
        int[][] arr = {
                {1, -2, 4, 5},
                {6, -7, 8, -9}
        };

        System.out.println("Array: " + Arrays.deepToString(arr));

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < 0) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
    }
}
