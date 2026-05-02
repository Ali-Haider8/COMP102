package L3;
/*
Q1: - Write java program to create array Price [4].
1- input from keyboard any prices
2- make discount 50% for each price in array then save results in new array discount[] then
return new array and print result in main method.
*/

import java.util.Scanner;

public class Make50DiscountArrayMethod {

    public static void main(String[] args) {
        int[] Price = new int[4];
        enterArrayElements(Price);
        printArrayElements(discount(Price));
    }

    static void enterArrayElements(int[] arr) {
        System.out.print("Enter " + arr.length + " prices: ");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    static int[] discount(int[] arr) {
        int[] discount = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            discount[i] = (arr[i] * 50) / 100;
        }
        return discount;
    }

    static void printArrayElements(int[] arr) {
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
