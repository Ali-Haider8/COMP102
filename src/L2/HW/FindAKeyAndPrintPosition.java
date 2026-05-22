package L2.HW;

/*
Q3: Check if an Key=5 exists in the matrix. If yes, print its
position(s).

Source: 3- H.W. 2D array using java 2025.pdf (page 1 of 1)
*/

public class FindAKeyAndPrintPosition {

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {5, 8, 9}};

        System.out.println("Find key (5) in matrix ");
        boolean found = false;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 5) {
                    found = true;
                    String position = "(" + i + ", " + j + ")";
                    System.out.println("Key found at position " + position);
                }
            }
        }

        if (!found) System.out.println("Key not found");

    }
}
