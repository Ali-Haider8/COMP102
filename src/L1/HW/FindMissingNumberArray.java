package L1.HW;

import java.util.Scanner;

public class FindMissingNumberArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
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

        int actualSum = 0;
        for (int x : arr) {
            actualSum = actualSum + x;
        }

        int missing = expectedSum - actualSum;
        System.out.println();
        System.out.print("Missing Number = " + missing);
    }
}