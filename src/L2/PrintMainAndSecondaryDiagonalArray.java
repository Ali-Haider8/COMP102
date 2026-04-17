package L2;

import java.util.Scanner;
import java.util.Arrays;
class PrintMainAndSecondaryDiagonalArray {

    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of side of the sqare 2D array: ");
        int n = input.nextInt();
        int arr[][] = new int[n][n];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = input.nextInt();
            }
        }

        System.out.println(Arrays.deepToString(arr));

    }
}
