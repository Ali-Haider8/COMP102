package Other;

import java.util.Scanner;

public class TypeCastings {
    static void main() {

        Scanner input = new Scanner(System.in);


        System.out.println("Select a type to casting");
        System.out.println("1) from char to int");
        System.out.println("2) from int to char");
        System.out.println("3) from double to int");
        System.out.println("4) from int to double");
        System.out.print("Number: ");
        int choice = input.nextInt();

        switch (choice) {
            case 1:
                char a;
                int z;
                System.out.print("Enter a char value: ");
                a = input.next().charAt(0);
                z = a;
                System.out.println("Int value for char " + a + " is " + z);
                break;
            case 2:
                System.out.print("Enter an int value: ");
                int x = input.nextInt();
                char b = (char) x;
                System.out.println("Char value for int " + x + " is " + b);
                break;
            case 3:
                double d;
                int y;
                System.out.print("Enter a double value: ");
                d = input.nextDouble();
                y = (int) d;
                System.out.println("Int value for double " + d + " is " + y);
                break;
            case 4:
                int k;
                double f;
                System.out.print("Enter an int value: ");
                k = input.nextInt();
                f = k;
                System.out.println("Double value for int " + k + " is " + f);
            default:
                System.out.println("Invalid choice");
        }
    }
}
