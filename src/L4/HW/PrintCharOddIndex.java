package L4.HW;

/*
Q3: Wrtie java program to read String from Keyboard then
print char at every odd index.

Source: 2- JavaStringH.W2025.pdf (page 1 of 1)
*/

import java.util.Scanner;

public class PrintCharOddIndex {

    static void printChatAtOddIndex(String text) {
        char[] ch = text.toCharArray();
        for (int i = 0; i < ch.length; i++)
            if (i % 2 != 0) System.out.println(ch[i] + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        printChatAtOddIndex(text);
        sc.close();

    }
}
