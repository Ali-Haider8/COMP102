package L2.Others;

/*
Q2: Write down a Java program to read a 2-dimensional array x[4][4] then perform each of the following: (15 marks)
1. Find the maximum and minimum in the third row.
2. print positive numbers only in the main diagonal.
3. Replace the upper triangle elements with 1.

| -1  3  5  6 |
|  5  2  4  6 |
|  3  4  5  7 |
|  1  7  9 -3 |

Source: final-exams-batool.pdf (page 1 of 6)
*/

public class ReplaceUpperTriangleElementsWtihOne {

    public static void main(String[] args) {

        int[][] arr = {
                {-1, 3, 5, 6},
                {5, 2, 4, 6},
                {3, 4, 5, 7},
                {1, 7, 9, -3}
        };

        // Find Max and Min in 3rd row
        int max = arr[2][0];
        int min = arr[2][0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[2][i] > max) max = arr[2][i];
            if (arr[2][i] < min) min = arr[2][i];
        }
        System.out.println("Max in 3rd row: " + max);
        System.out.println("Min in 3rd row: " + min);

        // Print positive numbers in main diagonal
        System.out.print("Positive numbers in main diagonal: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][i] > 0) System.out.print(arr[i][i] + " ");
        }

        // Replace the upper triangle elements with 1
        System.out.println("\nUpper triangle elements");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j > i) arr[i][j] = 1;
            }
        }
        // Print the matrix
        for (int[] row : arr) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

    }
}
