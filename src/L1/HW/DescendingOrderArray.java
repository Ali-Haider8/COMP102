package L1.HW;

import java.util.Scanner;

// Q> Write a Java program to sort the items of an array in descending order.

@SuppressWarnings("DuplicatedCode")
public class DescendingOrderArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.print("Enter 5 numbers: ");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }
        sc.close();

        System.out.print("Array numbers are: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        System.out.println();
        System.out.print("Descending Order: ");

        int swap;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] < numbers[j]) {
                    swap = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = swap;
                }
            }
        }

        for (int number : numbers) {
            System.out.print(number + " ");
        }

    }
}
