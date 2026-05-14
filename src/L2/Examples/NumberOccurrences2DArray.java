package L2.Examples;

/*
Source: 7- two-dimension-array-examples-and-homeworks-jammel.pdf (page 4 of 6)
*/

import java.util.Arrays;

public class NumberOccurrences2DArray {

    public static void main(String[] args) {

        int counter = 0;
        int[][] numbers = {{1, 2, 3, 4, 5, 6}, {1, 2, 3, 4, 5}, {9, 8}};

        System.out.println(Arrays.deepToString(numbers));

        int key = 1;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] == 1) counter += 1;
            }
        }
        System.out.println(key + " -> " + counter);
    }
}
