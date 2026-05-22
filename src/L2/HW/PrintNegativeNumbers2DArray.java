package L2.HW;
/*
Q2> Write a Java program to print negative numbers in an 2D array.

Source: 2- Two-dimensional Array Examples.pdf (page 3 of 3)
*/

public class PrintNegativeNumbers2DArray {

    public static void main(String[] args) {
        int[][] arr = {{1, -2, 3}, {-4, 5, 6}};

        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr[i].length; j++)
                if (arr[i][j] < 0) System.out.print(arr[i][j] + " ");

    }
}
