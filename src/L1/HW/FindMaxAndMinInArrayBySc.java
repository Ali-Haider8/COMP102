package L1.HW;

import java.util.Scanner;

public class FindMaxAndMinInArrayBySc {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.print("Enter 5 numbers: ");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }
        sc.close();

        System.out.print("The Array items are: ");

        for (int number : numbers) {
            System.out.print(number + " ");
        }

        System.out.println();
        int max = numbers[0];
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            } else if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);


    }
}
