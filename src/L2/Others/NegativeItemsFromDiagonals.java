package L2.Others;

/*
Source: 6- two-dimension-array-examples-batool.pdf (page 21 of 26)
*/

public class NegativeItemsFromDiagonals {

    public static void main(String[] args) {
        int[][] arr = {
                {-1, -2, -3},
                {-4, 5, -6},
                {-7, -8, -9}
        };

        int n = arr.length;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if ((i == j || i + j == n - 1) && arr[i][j] < 0) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }

    }

}
