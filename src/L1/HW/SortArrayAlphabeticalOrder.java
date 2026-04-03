package L1.HW;

import java.util.Scanner;
import java.util.Arrays;

public class SortArrayAlphabeticalOrder {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] names = new String[5];

        System.out.println("Enter 5 names (press enter for every name): ");

        for (int i = 0; i < names.length; i++) {
            names[i] = sc.nextLine();
        }

        System.out.print("The items of array: ");

        for (String name : names) {
            System.out.print(name + " ");
        }

        System.out.println();
        System.out.print("Alphabetical order: ");
        Arrays.sort(names, String.CASE_INSENSITIVE_ORDER);

        for (String name : names) {
            System.out.print(name + " ");
        }
    }
}
