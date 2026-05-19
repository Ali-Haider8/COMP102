package L1.HW;

import java.util.Scanner;



/*
2- Rewrite second program and input char instead of string from keyboard

* second program:
Q1: Write Java program to create array have 5 string items {Ali, Hassan ,
Mohaamed, Jaafar}
Then search for word Ali , if his name in array , print found if not print
not found.

Source: 3- 1D Array Programs.pdf (page 2 of 2)
*/

public class FindACharArray {

    static boolean isCharInArray(char[] arr, char c) {
        for (char ch : arr) if (ch == c) return true;
        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char[] chars = new char[5];

        System.out.print("Enter 5 characters: ");
        for (int i = 0; i < chars.length; i++) {
            chars[i] = sc.next().charAt(0);
        }

        System.out.print("Find a char in array: ");
        char a = sc.next().charAt(0);
        sc.close();

        if (isCharInArray(chars, a)) System.out.println("Char founded in array");
        else System.out.println("Char wasn't founded");

    }
}
