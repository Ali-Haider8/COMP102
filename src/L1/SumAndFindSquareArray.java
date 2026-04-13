package L1;

//  Q3/ Write java program to create 1d array has 10 float numbers performce the following:
//1- sum all items from index O to 3
//2- find square all items from 3 to end of array

import java.util.Scanner;

class SumAndFindSquareArray {

    static void main() {

        Scanner sc = new Scanner(System.in);
        float[] arr = {0.1f, 0.2f, 0.3f, 0.4f, 0.5f, 0.6f, 0.7f, 0.8f, 0.9f, 1.0f};


        float sum = 0;
        for (int i = 0; i < 4; i++) {
            sum += arr[i];
        }
        System.out.println("Sum of items from index 0 to 3 is: " + sum);

        for (int i = 3; i < arr.length; i++) {
            System.out.println("Square of item at index " + i + " (" + arr[i] + ")" + " is: " + (arr[i] * arr[i]));
        }
    }
}
