package L4.HW;

/*
Q5: write java code to input from keyboard string =” Hello I love Iraq” change the
word Hello with wellcom then remove all the spaces and print the final string.

Source: 2- JavaStringH.W2025.pdf (page 1 of 1)
*/

import java.util.Scanner;

public class ChangeHelloToWelcome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write: \" Hello I love Iraq\"");
        String text = sc.nextLine();
        text = text.trim();
        if (text.contains("Hello"))
            text = text.replace("Hello", "Welcome");
        System.out.println("New text: " + text);
    }
}
