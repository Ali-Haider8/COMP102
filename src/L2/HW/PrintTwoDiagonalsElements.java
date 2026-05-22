package L2.HW;

/*
Q3> Write a Java program to read of an 2D array then to print the two diagonals
elements only.

Source: 2- Two-dimensional Array Examples.pdf (page 3 of 3)
*/

import java.util.Scanner;

public class PrintTwoDiagonalsElements {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        System.out.print("Enter 9 array elements: ");
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr[i].length; j++) arr[i][j] = sc.nextInt();
        sc.close();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++)
                if (i == j || i + j == arr.length - 1)
                    System.out.print(arr[i][j]);
                else if (i == 1) System.out.print("  ");
                else System.out.print("\t");
            System.out.println();
        }
    }
}

