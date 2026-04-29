package L2.HW;

import java.util.Arrays;

public class AssendingOrder2DArray {

    public static void main(String[] args) {
        int[][] arr = {
                {5, 3, 4},
                {2, 6, 7},
                {1, 9, 8}
        };

        /*int swap;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = 0; k < arr.length; k++) {
                    for (int l = 0; l < arr.length; l++) {
                        if (arr[i][j] > arr[k][l]) {
                            swap = arr[i][j];
                            arr[i][j] = arr[k][l];
                            arr[k][l] = swap;
                        }
                    }
                }
            }
        }*/

        for (int[] x : arr) {
            for (int y : x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }

    }
}
