package L2.Others;

/*
Write a program to print the upper triangle and replace with number 1.
Source: exams-snapshots-batool.pdf (page 1 of 21)
*/

public class MatrixUpperTrianglePatternToOneNumber {

    public static void main(String[] args) {

        int arr[][] = {
                {2, 3, 4},
                {5, 0, 6},
                {4, 2, 3}
        };

        int n = arr.length;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i + j < n - 1) System.out.print(1+" ");
                else System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }


    }
}
