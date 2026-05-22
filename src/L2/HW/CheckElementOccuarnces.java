package L2.HW;

/*

Q1> Write a Java program to count the number of occurrences of an element in an
2D array.

Source: 2- Two-dimensional Array Examples.pdf (page 3 of 3)
*/

public class CheckElementOccuarnces {

    static void printOccurrences(int[][] arr, int element) {
        int count = 0;
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr[i].length; j++)
                if (arr[i][j] == element) count++;
        System.out.println(element + " -> " + count);
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 2}, {3, 3, 3}};

        for (int[] cols : arr)
            for (int n : cols)
                printOccurrences(arr, n);
    }
}
