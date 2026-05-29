package L3.HW;

/*
1- Write java program to create three method , area of circle
area of square , areae of trangel , with passing parameter from keyboard, use
(switch ) to make options for methods

Source: 6- homeworks16-04.pdf (page 1 of 1)
*/

import java.util.Scanner;

public class SwitchOptionsMethods {

    static void areaCircle(double radius) {
        double area = Math.PI * radius * radius;
        System.out.println("Area of the circle: " + area);
    }

    static void areaSquare(int length) {
        int area = length * length;
        System.out.println("Area of the square: " + area);
    }

    static void areaTriangle(int base, int height) {
        int area = (int) ((0.5) * (base * height));
        System.out.println("Area of the triangle: " + area);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("You have three option: ");
        System.out.println("1 for area of circle");
        System.out.println("2 for area of square");
        System.out.println("3 for area of triangle");
        System.out.print("\nEnter your option: ");
        int option = sc.nextInt();

        switch (option) {
            case 1:
                System.out.print("Enter a radius: ");
                double radius = sc.nextDouble();
                sc.close();
                areaCircle(radius);
                break;
            case 2:
                System.out.print("Enter a length: ");
                int length = sc.nextInt();
                sc.close();
                areaSquare(length);
                break;
            case 3:
                System.out.print("Enter a base: ");
                int base = sc.nextInt();
                System.out.print("Enter a height: ");
                int height = sc.nextInt();
                sc.close();
                areaTriangle(base, height);
                break;
            default:
                System.out.println("Invalid option");
        }

    }
}
