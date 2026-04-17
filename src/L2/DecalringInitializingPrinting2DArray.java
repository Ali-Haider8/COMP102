package L2;

// Array2dExample1
// To access an element in a 2D array requires both a row and a column index. And a
//  pair of nested loops is usually used to process each element.

class DecalringInitializingPrinting2DArray {

    static void main() {
        // Decalring and initializing 2D array
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        // Printing 2D array
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }
    }
}
