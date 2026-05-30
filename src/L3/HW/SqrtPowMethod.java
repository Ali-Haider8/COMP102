package L3.HW;

import java.util.Scanner;

/*
H.W:-1 Write Java Program to input number then create Method sqrtNumber()
and powerNumber() then input two cases from
keyboard ( 1: find sqrt 2: find power ).

Source: 5- H.W - Method.pdf (page 1 of 1)
*/

public class SqrtPowMethod {
    static int a;
    static int b;

    static void findSquareRoot() {
        System.out.println("Square root for " + a + " is: " + Math.sqrt(a));
    }

    static void findPower() {
        System.out.println("Power for " + a + " of " + b + " is: " + Math.pow(a, b));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        a = sc.nextInt();
        System.out.print("Enter b: ");
        b = sc.nextInt();
        System.out.print("Enter 1 for square root, 2 for power: ");
        int choice = sc.nextInt();
        sc.close();

        if (choice == 1) {
            findSquareRoot();
        } else if (choice == 2) {
            findPower();
        } else {
            System.out.println("Invalid choice");
        }
    }
}
