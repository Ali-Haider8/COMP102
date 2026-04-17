package L2;

import java.util.Arrays;
import java.util.Scanner;

class Print2DArrayOptions {

    static void main() {

        System.out.println("Select a way for print 2D array");
        System.out.println("1) Arrays.deepToString()");
        System.out.println("2) for loop");
        System.out.println("3) row by row - Arrays.toString(row)");
        System.out.println("4) custom for - (i, j) loop");

        Scanner sc = new Scanner(System.in);
        System.out.print("Your choice: ");
        int choice = sc.nextInt();
        sc.close();

        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        
        switch (choice) {
            case 1:
                System.out.println("Print array useing Arrays.deepToString()");
                System.out.println(Arrays.deepToString(matrix));
                break;
            case 2:

                for (int[] row : matrix) { // 1. Get each row (which is an array)
                    for (int element : row) { // 2. Get each element in that row
                        System.out.print(element + " "); // 3. Move to next line after each row
                    }
                    System.out.println();
                }
                break;
            case 3:
                for (int[] row : matrix) {
                    // Print each row like: [1,2,3]
                    System.out.println(Arrays.toString(row));
                }
                break;
            case 4:
                for (int i = 0; i < matrix.length; i++) {
                    for (int j = 0; j < matrix[i].length; j++) {
                        System.out.print(matrix[i][j] + "\t");
                    }
                    System.out.println();
                }
                break;
            default:
                System.out.println("Invalid input");
        }

    }
}
