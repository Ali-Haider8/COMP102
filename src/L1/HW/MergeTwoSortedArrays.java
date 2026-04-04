package L1.HW;

import java.util.Scanner;

public class MergeTwoSortedArrays {

    public static void main(String[] args) {

        int[] arr1, arr2, arr3;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size for first array: ");
        int arr1Size = sc.nextInt();

        System.out.print("Enter size for second array: ");
        int arr2Size = sc.nextInt();

        arr1 = new int[arr1Size];
        arr2 = new int[arr2Size];

        System.out.print("Enter elements for first array: ");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }


        System.out.print("Enter elements for second array: ");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }
        sc.close();

        System.out.print("Array 1 elements: ");
        for (int x : arr1) {
            System.out.print(x + " ");
        }

        System.out.println();
        System.out.print("Array 2 elements: ");
        for (int x : arr2) {
            System.out.print(x + " ");
        }

        // sort first array
        int swap = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = i + 1; j < arr1.length; j++) {
                if (arr1[i] > arr1[j]) {
                    swap = arr1[j];
                    arr1[j] = arr1[i];
                    arr1[i] = swap;
                }
            }
        }

        System.out.println();
        System.out.print("Array 1 elements sorted: ");
        for (int x : arr1) {
            System.out.print(x + " ");
        }

        // sort second array

        for (int i = 0; i < arr2.length; i++) {
            for (int j = i + 1; j < arr2.length; j++) {
                if (arr2[i] > arr2[j]) {
                    swap = arr2[j];
                    arr2[j] = arr2[i];
                    arr2[i] = swap;
                }
            }
        }

        System.out.println();
        System.out.print("Array 2 elements sorted: ");

        for (int x : arr2) {
            System.out.print(x + " ");
        }

        arr3 = new int[arr1Size + arr2Size];

        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            arr3[i + arr1.length] = arr2[i];
        }

        System.out.println();
        System.out.print("Arrays Merged: ");

        for (int x : arr3) {
            System.out.print(x + " ");
        }

        // sort arr3
        for (int i = 0; i < arr3.length; i++) {
            for (int j = i + 1; j < arr3.length; j++) {
                if (arr3[i] > arr3[j]) {
                    swap = arr3[j];
                    arr3[j] = arr3[i];
                    arr3[i] = swap;
                }
            }
        }

        System.out.println();
        System.out.print("Array 3 elements sorted: ");

        for (int x : arr3) {
            System.out.print(x + " ");
        }

    }
}
