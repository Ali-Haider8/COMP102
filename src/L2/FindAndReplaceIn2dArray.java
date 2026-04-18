package L2;

import java.util.Scanner;

/*
Example 4: Write down a Java program to read a 2-dimensional array x[4][4] then
perform each of the following:
1. Find the maximum and minimum in the third row
2. Replace the two diagonals with 1
*/
class FindAndReplaceIn2dArray {

    static void main() {
        int[][] x = new int[4][4];
        int min, max;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the array elements: ");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                x[i][j] = s.nextInt();
            }
        }
        s.close();

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(x[i][j] + " ");
            }
            System.out.println();
        }

        min = x[3][0];
        max = x[3][0];

        for (int j = 0; j < 4; j++) {
            if (min > x[3][j]) {
                min = x[3][j];
            }
            if (max < x[3][j]) {
                max = x[3][j];
            }
        }
        System.out.println("The minimum value is " + min);
        System.out.println("The maximum value is " + max);

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == j) { // Condition for principal diagonal
                    x[i][j] = 1;
                }
                if ((i + j == 3)) { // Condition for secondary diagonal
                    x[i][j] = 1;
                }
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(x[i][j] + " ");
            }
            System.out.println();
        }
    }
}
