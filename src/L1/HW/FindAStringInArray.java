package L1.HW;

import java.util.Scanner;

/*
Q1: Write Java program to create array have 5 string items {Ali, Hassan ,
Mohaamed, Jaafar}
Source: 3- 1D Array Programs.pdf (page 2 of 2)
*/

public class FindAStringInArray {

    static Scanner sc = new Scanner(System.in);

    static void enterArrayElements(String[] arr) {
        System.out.println("Enter 5 names: ");
        for (int i = 0; i < arr.length; i++) arr[i] = sc.nextLine();
    }

    static boolean isNameExist(String[] arr, String name) {
        for (int i = 0; i < arr.length; i++)
            if (arr[i].equalsIgnoreCase(name)) return true;
        return false;
    }

    public static void main(String[] args) {
        String[] arr = new String[5];
        enterArrayElements(arr);

        System.out.println("Enter a name to find: ");
        String name = sc.nextLine();

        if (isNameExist(arr, name)) System.out.println("Name is found");
        else System.out.println("Name is not found");
    }
}
