package L1.HW;

import java.util.Scanner;

/*
Q3: Write java codes to create array with any five integer items
{10,20,60,70,30} then find Max and Min Numbers in array

Source: 3- 1D Array Programs.pdf (page 2 of 2)
*/
public class FindMaxAndMinInArrayBySc {

    static void findMinAndMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] > max) max = arr[i];
                else if (arr[i] < min) min = arr[i];
            }
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.print("Enter 5 numbers: ");
        for (int i = 0; i < arr.length; i++) arr[i] = sc.nextInt();
        sc.close();

        findMinAndMax(arr);

    }
}
