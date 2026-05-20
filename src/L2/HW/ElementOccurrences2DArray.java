package L2.HW;

/*
Q1> Write a Java program to count the number of occurrences of an element in an
2D array.

Source: 2- Two-dimensional Array Examples.pdf (page 3 of 3)
*/

public class ElementOccurrences2DArray {

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {3, 2, 5}, {3, 6, 4}};
        // 1. go accross all array elemenets
        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[i].length; j++) {
                // 2. A) check if element is visited
                boolean visited = false;
                for (int pi = 0; pi < i; pi++) {
                    for (int pj = 0; pj < matrix[pi].length; pj++)
                        if (matrix[i][j] == matrix[pi][pj]) {
                            visited = true;
                            break;
                        }

                    if (visited) break;
                }
                // 2. B) check the same row before j
                if (!visited) for (int pj = 0; pj < j; pj++)
                    if (matrix[i][j] == matrix[i][pj]) {
                        visited = true;
                        break;
                    }
                // 3. bypass same elements
                if (visited) continue;
                // 4. calculate occurrences in the same row to the right of element
                int count = 1;
                for (int k = j + 1; k < matrix[i].length; k++)
                    if (matrix[i][j] == matrix[i][k]) {
                        count += 1;
                    }
                // 5. calculate occurrences in the other rows
                for (int ni = i + 1; ni < matrix.length; ni++)
                    for (int nj = 0; nj < matrix[ni].length; nj++)
                        if (matrix[i][j] == matrix[ni][nj]) {
                            count += 1;
                        }
                System.out.println(matrix[i][j] + " -> " + count); // 6. print result
            }
    }
}
