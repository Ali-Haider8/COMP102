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


        System.out.println("Enter elements for second array: ");
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = sc.nextInt();
        }
        sc.close();

        

    }
}
