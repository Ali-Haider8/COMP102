package L2.HW;

/*
Q3> Write a Java program to read of an 2D array then to print the two diagonals
elements only.
*/

import java.util.Scanner;

public class PrintTwoDiagonalsElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array coulumn: ");
        int col = sc.nextInt();
        System.out.print("Enter array row: ");
        int row = sc.nextInt();

        int[][] arr = new int[row][col];
        System.out.print("Enter array elements: ");

        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();

        System.out.println("---------------");
        System.out.println("Array: ");
        for (int[] rows : arr) {
            for (int element : rows) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        System.out.println("---------------");
        System.out.println("First Diagonals: ");
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                if (i == j) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }

        System.out.println();
        System.out.println("---------------");
        System.out.println("Second Diagonals: ");
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                if (i + j == arr.length - 1) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }

        System.out.println();
        System.out.println("---------------");
        System.out.println("Array with Two Diagonals Only: ");
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                if (i == j || i + j == arr.length - 1) {
                    System.out.print(arr[i][j]);
                } else {
                    if (i == 1) {
                        System.out.print("  ");
                    } else {
                        System.out.print("\t");
                    }
                }
            }
            System.out.println();
        }
    }
}

