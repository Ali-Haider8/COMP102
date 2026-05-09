package L3;

/*
Q2: Write java program to create array of 10 Names then passed this array to

1- Find(Names[], Key) to find key ("Ali") and print results in method.

2- Sort array using SortName(Names[]) then print sorted array

3- Use (Switch) to make options for methods

Source: All-Questions-Second-Course.pdf (page 5 of 24)
*/

import java.util.Scanner;

public class NamesArrayMethods {

    public static void main(String[] args) {
        String[] Names = {"Zahraa", "Ahmed", "Ali", "Sara", "Jawad", "Hassan", "Kadhim", "Walid", "Yonis", "Rana"};
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.print("Enter 1 to find, 2 to sort, 3 to exit: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    Find(Names, "Ali");
                    break;
                case 2:
                    SortName(Names);
                    break;
                case 3:
                    System.out.println("Exiting...");
                    sc.close();
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 3);
    }

    static void Find(String[] Names, String key) {
        boolean found = false;
        for (int i = 0; i < Names.length; i++) {
            if (Names[i].equalsIgnoreCase(key)) {
                System.out.println(key + " found at index " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println(key + " not found");
        }
    }

    static void SortName(String[] Names) {
        for (int i = 0; i < Names.length; i++) {
            String temp;
            for (int j = 0; j < Names.length; j++) {
                if (Names[i].charAt(0) < Names[j].charAt(0)) {
                    temp = Names[i];
                    Names[i] = Names[j];
                    Names[j] = temp;
                }
            }
        }

        System.out.print("Sorted Names: ");
        for (String name : Names) {
            System.out.print(name + " ");
        }
        System.out.println();
    }
}
