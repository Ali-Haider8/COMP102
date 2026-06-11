package L1.Others;

/*
Q3> Write down a Java program that will double the value of every item in an
array?
Source: Other-Lectures/ 4- Two-Dimensional Array.pdf (page 9 of 9)
*/

public class DoubleTheValueEveryItem {
    static int doubleValueItem(int n) {
        return n * 2;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        for (int i = 0; i < arr.length; i++) {
            arr[i] = doubleValueItem(arr[i]);
        }

        for (int n : arr) {
            System.out.print(n + " ");
        }

    }
}
