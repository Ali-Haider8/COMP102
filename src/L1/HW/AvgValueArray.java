package L1.HW;

import java.util.Scanner;
//10. create array from keyboard then Calculate Average Value
public class AvgValueArray {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.print("Enter elements for array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        for (int x : arr) {
            sum = sum + x;
        }
        double avg = (double) sum / size;

        System.out.println("Average value of array is: " + avg);
    }
}
