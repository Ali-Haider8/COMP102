package L2.Others;

/*
Q4: With a 2-D array of ten integer numbers, write a Java program to find the following: choose three only (12 marks)
a) The average of even numbers.
b) Print prime numbers only.
c) Print negative numbers only in the Secondary diagonal.
d) Replace the main diagonal elements by 1

Source: final-exams-batool.pdf (page 6 of 6)
*/

public class TwoDimmensionArrayWithThreeOptions {

    static boolean isPrime(int n) {
        if (n < 1) return false;
        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    static boolean isEven(int n) {
        return n % 2 == 0;
    }

    static int[] getSecondaryDiagonalItems(int[][] arr) {
        int[] secondaryDiagonalItems = new int[arr.length];
        int j = arr.length - 1;
        for (int i = 0; i < arr.length; i++)
            secondaryDiagonalItems[i] = arr[i][j--];
        return secondaryDiagonalItems;
    }

    static boolean isNegative(int n) {
        return n < 0;
    }

    static void replaceMainDiagonalItems(int[][] arr) {
        for (int i = 0; i < arr.length; i++)
            arr[i][i] = 1;
    }

    static void printArr(int[][] arr) {
        for (int[] row : arr) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[][] arr = {{+10, +11, +12, +13}, {+14, +15, -16, +17}, {+18, +19, +20, +21}, {-22, +23, +24, +25}};

        // Print average of even numbers
        int average = 0;
        int count = 0;
        for (int[] row : arr) {
            for (int element : row) {
                if (isEven(element)) {
                    average += element;
                    count++;
                }
            }
        }
        average = average / count;
        System.out.println("Average of even numbers: " + average);

        System.out.println("---------------");
        // Print prime numbers only
        System.out.print("Prime Numbers: ");
        for (int[] row : arr) {
            for (int element : row) {
                if (isPrime(element)) System.out.print(element + " ");
            }
        }

        System.out.println("\n---------------");
        // Print negative numbers in Secondary diagonal
        System.out.print("Negative numbers in Secondary diagonal: ");
        int[] secondaryDiagonalItems = getSecondaryDiagonalItems(arr);
        for (int element : secondaryDiagonalItems)
            if (isNegative(element)) System.out.print(element + " ");

        System.out.println("\n---------------");
        // Replace main diagonal items with 1
        System.out.println("Matrix after replacing main diagonal items with 1");
        replaceMainDiagonalItems(arr);
        printArr(arr);

    }
}