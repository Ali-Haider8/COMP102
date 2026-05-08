package L3.HW;

/*
3- Write java code to create three methods  and call these methods using
switch case (1: findeven( a[]), 2: findodd(a[]), 3: findnegative(a[]))

Source: 4- H.W Methods using Java 2025.pdf (page 1 of 1)
*/

import java.util.Scanner;

public class FindInArrayThreeMethods {

    static void findeven(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                System.out.println(a[i] + " is even");
            }
        }
    }

    static void findodd(int[] a) {
        for (int element : a) {
            if (element % 2 != 0)
                System.out.println(element + " is odd");
        }
    }

    static void findnegative(int[] a) {
        for (int element : a) {
            if (element < 0)
                System.out.println(element + " is negative");
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, -7, 6, 4, -8, -3, 0, 10};
        System.out.println("Choose an option\n1: findeven, 2: findodd, 3: findnegative");
        System.out.print("Your choice: ");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                findeven(arr);
                break;
            case 2:
                findodd(arr);
                break;
            case 3:
                findnegative(arr);
                break;
            default:
                System.out.println("Invalid choice");
        }

    }
}
