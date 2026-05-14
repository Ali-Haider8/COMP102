package L3.HW;

/*
Source:  (page 1 of 1)
*/

import java.util.Scanner;

public class FindNumber2DArrayMethod {

    static void check(int[][] arr, int key) {
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == key) {
                    System.out.println("Found at " + i + ", " + j);
                    found = true;
                }
            }
        }
        if (!found) System.out.println("Not Found");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter rows number: ");
        int rows = input.nextInt();

        System.out.print("Enter columns number: ");
        int cols = input.nextInt();

        int[][] arr = new int[rows][cols];

        System.out.print("Enter " + (rows * cols) + " number: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = input.nextInt();
            }
        }
        System.out.print("Find a number in array: ");
        int key = input.nextInt();
        check(arr, key);


    }
}
