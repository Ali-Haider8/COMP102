package L1.HW;

import java.util.Scanner;
// 9. Create array from the keyboard then print the array from second position after
//that Find Missing number in Consecutive Integers:
public class FindMissingNumberArray {

    static void main(String[] args) {

        /*Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.print("Enter array elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Array from second position: ");
        for (int i = 1; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        int expectedSum = 0;
        for (int i = arr[0]; i <= arr[size - 1]; i++) {
            expectedSum = expectedSum + i;
        }

        // inputed array: {1, 3, 4}
        // expected array: {1, 2, 3, 4}
        // inputed array = actual array

        // {1, ..., 4}
        // expected sum = 1 + (2 + 3 + 4)  = 10

        int actualSum = 0;
        for (int x : arr) {
            actualSum = actualSum + x;
        }

        // {1, ..., 4}
        // actual sum = 1 + ( 3 ) + 4 = 8

        // 10 - 8 = 2
        // mising number is 2

        int missing = expectedSum - actualSum;
        System.out.println();
        System.out.print("Missing Number = " + missing);*/

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.print("Enter elements of array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        /*// arr = {5, 6 , 8}
        int x = 0;
        for (int i = arr[0]; i <= arr[arr.length - 1]; i++) {
            if (arr[x] == i) {
                x = x + 1;
            } else {
                System.out.println("The missing number: " + i);
            }
        }*/

        /*// arr = {5, 6 , 8}
        int x = 5;
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] == x) {
                x = x + 1;
            } else {
                System.out.println("The missing number: " + x);
            }
        }*/

        int x = arr[0];
        for (int i = 0; i <= arr.length-1 ; i++) {
            if (x == arr [i]) {
                x = x + 1;
            } else {
                System.out.println("The missing number: " + x);
            }
        }

    }
}