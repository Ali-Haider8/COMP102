package L1.HW;

import java.util.Scanner;

// Q> Write a Java program to print the prime numbers in an array.
public class PrintPrimeNumbersArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.print("Enter an element for the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }


        System.out.println();
        for (int x : arr) {
            boolean isPrime = x > 1;
            for (int i = 2; i * i <= x; i++) {
                if (x % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            System.out.println(x + " is a prime number? " + isPrime);
        }


    }


}
