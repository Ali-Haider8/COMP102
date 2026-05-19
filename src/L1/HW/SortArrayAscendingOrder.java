package L1.HW;

import java.util.Scanner;

/*
Q2: Write java codes to create array with any five integer items { 5,4,2,1}
then sorting array in ascending order.

Source: 3- 1D Array Programs.pdf (page 2 of 2)
*/


public class SortArrayAscendingOrder {

    static void enterArrayItems(int[] arr, Scanner sc) {
        for (int i = 0; i < arr.length; i++) arr[i] = sc.nextInt();
    }

    static void sortAscendingOrder(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[4];

        System.out.print("Enter 4 numbers: ");
        enterArrayItems(numbers, sc);

        sortAscendingOrder(numbers);
        for (int number : numbers) System.out.print(number + " ");


    }
}
