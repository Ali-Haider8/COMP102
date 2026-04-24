package L2.HW;

/*
Q3: Check if an Key=5 exists in the matrix. If yes, print its
position(s).
*/

import java.util.Scanner;

public class FindAKeyAndPrintPosition {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row: ");
        int row = sc.nextInt();
        System.out.print("Enter column: ");
        int column = sc.nextInt();
        int[][] matrix = new int[row][column];

        System.out.print("Enter matrix elements " + "(" + (row * column) + ")" + ": ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        sc.close();

        System.out.println();
        System.out.println("Find key (5) in matrix ");
        System.out.println("---------------");
        boolean found = false;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 5) {
                    found = true;
                    System.out.println("Key found at position " + "(" + i + ", " + j + ")");
                }
            }
        }

        if (!found) {
            System.out.println("Key not found");
        }

    }
}
