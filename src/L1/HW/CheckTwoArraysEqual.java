package L1.HW;

import java.util.Scanner;

/*
7. Create any two arrays from keyboard then Check if Two Arrays Are Equal:

Source: 4- 1D Array H.W 2026.pdf (page 1 of 2)
*/

public class CheckTwoArraysEqual {

    static boolean isTwoArraysEqual(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr1.length; i++)
            if (arr1[i] != arr2[i]) return false;
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int arraysSize = sc.nextInt();

        int[] firstArray = new int[arraysSize];
        int[] secondArray = new int[arraysSize];

        System.out.print("Enter first array elements: ");
        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = sc.nextInt();
        }

        System.out.print("Enter second array elements: ");
        for (int i = 0; i < secondArray.length; i++) {
            secondArray[i] = sc.nextInt();
        }
        sc.close();


        if (isTwoArraysEqual(firstArray, secondArray)) {
            System.out.println("Two arrays are equal");
        } else {
            System.out.println("Two arrays are not equal");
        }

    }
}
