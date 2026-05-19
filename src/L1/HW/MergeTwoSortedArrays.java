package L1.HW;

import java.util.Scanner;

/*
3. Create any two integer array from Keyboard , then Merge Two Sorted Arrays

Source: 4- 1D Array H.W 2026.pdf (page 1 of 2)
*/

public class MergeTwoSortedArrays {

    static void enterArrayElements(int[] arr, Scanner sc) {
        for (int i = 0; i < arr.length; i++) arr[i] = sc.nextInt();

    }

    static int[] sortedArray(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    static int[] margedArray(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length + arr2.length];
        int index = 0;
        for (int x : arr1) arr3[index++] = x;
        for (int x : arr2) arr3[index++] = x;
        return arr3;
    }

    public static void main(String[] args) {

        int[] arr1, arr2;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size for first array: ");
        int arr1Size = sc.nextInt();

        System.out.print("Enter size for second array: ");
        int arr2Size = sc.nextInt();

        arr1 = new int[arr1Size];
        arr2 = new int[arr2Size];

        System.out.print("Enter elements for first array: ");
        enterArrayElements(arr1, sc);

        System.out.print("Enter elements for second array: ");
        enterArrayElements(arr2, sc);
        sc.close();

        arr1 = sortedArray(arr1);
        arr2 = sortedArray(arr2);

        int[] margedArray = margedArray(arr1, arr2);
        margedArray = sortedArray(margedArray);
        for (int element : margedArray) System.out.print(element + " ");

    }
}
