package L1.Examples;

import java.util.Scanner;

//  Q1: Write java program to create array
//  X = [200 - 100 - 300 - 150 - 99 - 170 - 120 - 33 - 40 - 1 - 55]
//  Then enter three cases using switch
//  1: sum items of array from 170 to end of array.
//  2: Input any key from keyboard then check it found or not in array.
//  3: Sort items from 200 to 170.

public class SwitchThreeCasesSumFindSort {

    public static void main(String[] args) {
        int[] X = {200, 100, 300, 150, 99, 170, 120, 33, 40, 1, 55};

        System.out.print("Array: ");
        for (int n : X) {
            System.out.print(n + " ");
        }

        System.out.print("\n\nSelect a number from 1 to 3:- ");
        System.out.print("\nNumber (1): sum items of array from 170 to end of array.");
        System.out.print("\nNumber (2): Input any key from keyboard then check it found or not in array.");
        System.out.print("\nNumber (3): Sort items from 200 to 170.");

        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter a number: ");
        int choice = sc.nextInt();
        System.out.println();

        switch (choice) {
            case 1:
                int sum = 0;
                for (int i = 5; i < X.length; i++) {
                    sum += X[i];
                }
                System.out.println("Sum of items from 170 to end of array: " + sum);
                break;
            case 2:
                System.out.print("Enter any key: ");
                int keyToCheck = sc.nextInt();
                boolean found = false;
                int keyIndex = 0;
                for (int i = 0; i < X.length; i++) {
                    if (X[i] == keyToCheck) {
                        found = true;
                        keyIndex = i;
                    }
                }
                if (found) {
                    System.out.println("Key found in array at index: " + (keyIndex + 1));
                } else {
                    System.out.println("Key not found in array.");
                }
                break;
            case 3:
                System.out.print("Array before sorting: ");
                for (int i = 0; i < X.length - 5; i++) {
                    System.out.print(X[i] + " ");
                }
                int temp;
                for (int i = 0; i < X.length - 5; i++) {
                    for (int j = i + 1; j < X.length - 5; j++) {
                        if (X[j] < X[i]) {
                            temp = X[i];
                            X[i] = X[j];
                            X[j] = temp;
                        }
                    }
                }
                System.out.print("\nArray after sorting: ");
                for (int i = 0; i < X.length - 5; i++) {
                    System.out.print(X[i] + " ");
                }
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
}
