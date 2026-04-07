package L1.HW;

import java.util.Scanner;

public class CheckTwoArraysEqual {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first array size: ");
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

        System.out.println();
        System.out.print("First array elements: ");
        for (int x : firstArray) {
            System.out.print(x + " ");
        }

        System.out.println();
        System.out.print("Second array elements: ");
        for (int x : secondArray) {
            System.out.print(x + " ");
        }

        boolean equal = true;

        for (int i = 0; i < arraysSize; i++) {
            if (firstArray[i] != secondArray[i]) {
                equal = false;
                break;
            }
        }

        System.out.println();
        System.out.println("Arrays are equal is: " + equal);

    }
}
