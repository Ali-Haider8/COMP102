package L2.Others;

/*
## Write down a Java program to find the multiplication of two 2D arrays?

Matrix A:
[ 1  2 ]
[ 3  4 ]

Matrix B:
[ 2  0 ]
[ 1  2 ]

Multiplication steps:
[ 1×2 + 2×1      1×0 + 2×2 ]
[ 3×2 + 4×1      3×0 + 4×2 ]

Result:
[ 4   4 ]
[ 10  8 ]


Source: 6- two-dimension-array-examples-batool.pdf (page 18 of 26)
*/

import java.util.Arrays;

public class Multiplication2DArrays {

    public static void main(String[] args) {

        int[][] a = {{1, 2}, {3, 4}};
        int[][] b = {{2, 0}, {1, 2}};

        System.out.println("Matrix A: " + Arrays.deepToString(a) + "\n" + "Matrix B: " + Arrays.deepToString(b));

        System.out.println("is: (A columns = B rows)?");
        if (a[0].length == b.length) System.out.println("Yes, we can multiply the two matrices");
        else System.out.println("No, we can't multiply the two matrices");

        int[][] result = new int[a.length][b[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                for (int k = 0; k < a[0].length; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        System.out.println("Result: ");
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }


    }
}
