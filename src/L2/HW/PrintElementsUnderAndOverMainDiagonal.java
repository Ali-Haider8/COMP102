package L2.HW;

/*
Q4: write java program to print elements under and over the main diagonal in 4×4
2D Array.

*/
public class PrintElementsUnderAndOverMainDiagonal {

    public static void main(String[] args) {
        int[][] matrix = {
                {10, 11, 12, 13},
                {14, 15, 16, 17},
                {18, 19, 20, 21},
                {22, 23, 24, 25}
        };

        int row = matrix.length;
        int col = matrix[0].length;

        System.out.println("Array: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("------------");
        System.out.println("above the main diagonal: ");
        for (int i = 0; i < row; i++) {
            for (int j = i + 1; j < col; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("------------");
        System.out.println("under the main diagonal: ");
        for (int i = 1; i < row; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("------------");
        System.out.println("Array elements only above and over main diagonal: ");

        for (int i = 0; i < row; i++) {

            for (int j = 0; j < col; j++) {
                if (i == j) {
                    System.out.print("\t");
                } else {
                    System.out.print(matrix[i][j] + "\t");
                }
            }
            System.out.println();
        }

    }
}

