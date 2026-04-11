package L1.HW;

import java.util.Scanner;
//  Q> Write a Java program to count the number of occurrences of an element in an
//  array.

public class ElementOccurrencesInArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.print("Enter 5 numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.print("The Array Elements: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println();
        System.out.print("Find occurrences for element: ");
        int element = sc.nextInt();
        sc.close();

        int occurrences = 0;
        for (int number : numbers) {
            if (number == element) {
                occurrences++;
            }
        }

        System.out.println("The Occurrences for " + element + " is: " + occurrences);
    }
}
