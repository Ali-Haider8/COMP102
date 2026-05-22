package L2.HW;
/*
Q2> Write a Java program to print negative numbers in an 2D array.

Source: 2- Two-dimensional Array Examples.pdf (page 3 of 3)
*/

public class PrintNegativeNumbers2DArray {

    public static void main(String[] args) {
        int[][] arr = {{1, -2, 3}, {-4, 5, 6}};

        for (int[] cols : arr)
            for (int element : cols)
                if (element < 0) System.out.print(element + " ");

    }
}
