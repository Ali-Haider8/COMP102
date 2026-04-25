package L3;

import java.util.Scanner;

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
