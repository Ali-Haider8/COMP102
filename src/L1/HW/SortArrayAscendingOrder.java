package L1.HW;

import java.util.Scanner;

public class SortArrayAscendingOrder {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[4];

        System.out.print("Enter 4 numbers: ");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.print("Array items are: ");

        for (int number : numbers) {
            System.out.print(number + " ");
        }

        System.out.println();
        System.out.print("Ascending Order Array: ");

        int swap = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
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
