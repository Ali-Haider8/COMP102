package L1.HW;

import java.util.Scanner;

// Q1: Write Java program to create array have 5 string items {Ali, Hassan ,
//Mohaamed, Jaafar}
//Then search for word Ali , if his name in array , print found if not print
//not found.
public class FindAStringInArray {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] names = new String[5];

        System.out.println("Enter 5 names (Press enter after each name): ");

        for (int i = 0; i < names.length; i++) {
            names[i] = sc.nextLine();
        }

        System.out.println();
        System.out.println("The elements of the array are: ");

        for (String name : names) {
            System.out.print(name + " ");
        }

        System.out.println();
        System.out.print("Find a name in array: ");
        String targetName = sc.nextLine();
        sc.close();

        int flag = 0;
        int i;
        for (i = 0; i < names.length; i++) {
            if (names[i].equals(targetName)) {
                flag = i;
            }
        }

        if (flag != 0) {
            System.out.println("The name is found in position " + (flag + 1));
        } else {
            System.out.println("The name wasn't founded in the array");
        }
    }
}
