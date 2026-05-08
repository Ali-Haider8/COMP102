package L3.HW;

import java.util.Scanner;

/*
H.W:-1 Write Java Program to input number then create Method sqrtNumber()
and powerNumber() then input two cases from
keyboard ( 1: find sqrt 2: find power ).

Source: 5- H.W - Method.pdf (page 1 of 1)
*/

public class SqrtPowMethod {
    static int a = 4;
    static int b = 5;

    static void findSquareRoot() {
        System.out.println("Square root for " + a + " is: " + Math.sqrt(a));
    }

    static void findPower() {
        System.out.println("Power for " + a + " of " + b + " is: " + Math.pow(a, b));
    }

    public static void main(String[] args) {
        System.out.println("a: " + a + ", b: " + b);
        System.out.print("Enter 1 for square root, 2 for power: ");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        if (choice == 1) {
            findSquareRoot();
        } else if (choice == 2) {
            findPower();
        } else {
            System.out.println("Invalid choice");
        }
    }
}
