package L1;

import java.util.Arrays;
import java.util.Scanner;

class VisitedOrNotArray {

    static void main() {

        Scanner input = new Scanner(System.in); // initialize scanner for user input
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();
        int[] arr = new int[size]; // create array of given size

        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                System.out.print("Enter the first value" + ": ");
                arr[i] = input.nextInt();
            }
            if (i > 0 && i < arr.length - 1) {
                System.out.print("Enter the next value" + ": ");
                arr[i] = input.nextInt();
            }
            if (i == arr.length - 1) {
                System.out.print("Enter the last value: ");
                arr[i] = input.nextInt();
            }
        }
        System.out.println();
        System.out.print("The Array is " + Arrays.toString(arr));
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            boolean visited = false;
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] == arr[i]) {
                    visited = true;
                    break;
                }
            }
            if (visited) continue;
            for (int k = i + 1; k < arr.length; k++) {
                if (arr[k] == arr[i]) {
                    count++;
                }
            }
            System.out.println(arr[i] + " -> " + count);
        }
    }
}