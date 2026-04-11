package L1;

//  Q3/ Write java program to create 1d array has 10 float numbers performce the following:
//1- sum all items from index O to 3
//2- find square all items from 3 to end of array

import java.util.Scanner;

class SumAndFindSquareArray {

    static void main() {

        Scanner sc = new Scanner(System.in);
        float[] arr = new float[10];

        System.out.print("Enter elements of array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextFloat();
        }

        float sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += arr[i];
        }
        System.out.println("Sum of items from index 0 to 3 is: " + sum);

        for (int i = 3; i < arr.length; i++) {
            System.out.println("Square of item at index " + i + " (" + arr[i] + ")" + " is: " + (arr[i] * arr[i]));
        }
    }
}
