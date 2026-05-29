package L4.HW;

/*
Q1: Wrtie java program to read String from Keyboard then
print char at every even index.

Source: 3- JavaString HW.pdf (page 1 of 1)
*/

import java.util.Scanner;

public class PrintCharEvenIndex {

    static void printCharEvenIndex(String text) {
        char[] ch = text.toCharArray();
        for (int i = 0; i < ch.length; i++)
            if (i % 2 == 0) System.out.println(ch[i] + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        sc.close();
        printCharEvenIndex(text);
    }
}
