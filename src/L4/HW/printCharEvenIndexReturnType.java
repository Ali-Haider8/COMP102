package L4.HW;

/*
Q2: rewrite every prev program with method using return type.

Q1: Wrtie java program to read String from Keyboard then
print char at every odd index.

Source: 3- JavaString HW.pdf (page 1 of 1)
*/

import java.util.Scanner;

public class printCharEvenIndexReturnType {

    static char[] arrEvenIndex(String text) {
        char[] ch = text.toCharArray(); // convert text to char arr

        int count = 0;
        for (int i = 0; i < ch.length; i++) // cal number of chars at even index
            if (i % 2 == 0) count++;

        char[] chEven = new char[count];
        int chEvenCounter = 0;
        for (int i = 0; i < ch.length; i++) // make char arr contains chars at even index
            if (i % 2 == 0) {
                chEven[chEvenCounter] = ch[i];
                chEvenCounter++;
            }
        return chEven;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        sc.close();
        char[] chEven = arrEvenIndex(text);
        for (char c : chEven) System.out.print(c + " ");
    }
}
