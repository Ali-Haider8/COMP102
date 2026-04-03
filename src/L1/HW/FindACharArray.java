package L1.HW;

import java.util.Scanner;

public class FindACharArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char[] chars = new char[5];

        System.out.print("Enter 5 characters: ");

        for (int i = 0; i < chars.length; i++) {
            chars[i] = sc.next().charAt(0);
        }

        System.out.print("Array items are: ");

        for (char c : chars) {
            System.out.print(c + " ");
        }

        System.out.println();
        System.out.print("Find a char in array: ");
        char a = sc.next().charAt(0);
        sc.close();

        int flag = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == a) {
                flag = i;
            }
        }

        if (flag != 0) {
            System.out.println("Char founded in position " + (flag + 1));
        } else {
            System.out.println("Char wasn't founded");
        }
    }
}
