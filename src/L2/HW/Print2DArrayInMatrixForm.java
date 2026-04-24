package L2.HW;
/*
Q1 : Write a program to input a 2D array from the Keyboard
and print it in matrix form.
*/

import java.util.Scanner;

public class Print2DArrayInMatrixForm {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row: ");
        int row = sc.nextInt();

        System.out.print("Enter column: ");
        int column = sc.nextInt();

        int[][] arr = new int[row][column];
        System.out.print("Enter " + (row * column) + " elements: ");

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Array in matrix form");
        for (int[] rows : arr) {
            for (int element : rows) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
