package L4.HW;

/*
Q3: Wrtie java program to read string (I am from Iraq)
from keybord and check country word only(Iraq: print Iraq, India : print
Indaia and if Qatar print from Qatar)
Source: 3- JavaString HW.pdf (page 1 of 1)
*/

import java.util.Scanner;

public class CheckCountryWord {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();

        String[] words = s1.split("\\s");
        for (int i = 0; i < words.length; i++) {
            if (words[i].equalsIgnoreCase("Iraq")) {
                System.out.println("IQ -> Iraq");
            } else if (words[i].equalsIgnoreCase("India")) {
                System.out.println("IN -> India");
            }
        }

    }
}
