package Other;

/*
abs():
* remove negative
4.0 -> 4.0
-4.0 -> 4.0

ceil():
* take to the up integer
4.0 -> 4.0 (4.0 = 4)
4.1 -> 5.0 (5.0 = 5)
-4.0 -> -4.0 (-4.0 = -4)
-4.1 -> -4.0 (-4.0 = -4)

floor():
* take to the down integer
4.0 -> 4.0 (4.0 = 4)
4.1 -> 4.0 (4.0 = 4)
-4.0 -> -4.0 (-4.0 = -4)
-4.1 -> -5.0 (-5.0 = -5)

round():
* take to the nearest integer
4.1 -> 4
-4.1 -> -4
4.5 -> 5
-4.5 -> -4

*/

import java.util.Scanner;

public class MathMethods {
    private static float n1, n2;

    public static void main(String[] args) {
        EnterParameters();
        makeOperations(n1, n2);
    }

    private static void EnterParameters() {
        System.out.println("abs() - ceil() - floor() - round()");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        n1 = sc.nextFloat();
        sc.nextLine();
        System.out.print("Enter second number: ");
        n2 = sc.nextFloat();
        sc.nextLine();
        sc.close();
    }

    private static void makeOperations(float a, float b) {
        System.out.println("---------------");
        System.out.println("abs() -> " + a + " = " + Math.abs(a));
        System.out.println("abs() -> " + b + " = " + Math.abs(b));
        System.out.println("---------------");
        System.out.println("ceil() -> " + a + " = " + Math.ceil(a));
        System.out.println("ceil() -> " + b + " = " + Math.ceil(b));
        System.out.println("---------------");
        System.out.println("floor() -> " + a + " = " + Math.floor(a));
        System.out.println("floor() -> " + b + " = " + Math.floor(b));
        System.out.println("---------------");
        System.out.println("round() -> " + a + " = " + Math.round(a));
        System.out.println("round() -> " + b + " = " + Math.round(b));
    }
}
