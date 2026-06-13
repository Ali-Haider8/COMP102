package L2.Others;

/*
Source:  (page 1 of 1)
*/

public class Sort2DArrayAsending {

    public static void main(String[] args) {
        int[][] matrix = {{4, 2, 5}, {6, 1, 9}};

        int temp;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                for (int k = 0; k < matrix.length; k++) {
                    for (int l = 0; l < matrix[k].length; l++) {
                        if (matrix[i][j] > matrix[k][l]) {
                            temp = matrix[i][j];
                            matrix[i][j] = matrix[k][l];
                            matrix[k][l] = temp;
                        }
                    }
                }
            }
        }

        for (int[] cols : matrix) {
            for (int element : cols) {
                System.out.print(element + " ");
            }
        }
    }
}
