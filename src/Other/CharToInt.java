package Other;

import java.util.Scanner;

public class CharToInt {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter char value from ASCII Table: ");
        char a = input.next().charAt(0);
        int z = (int) a;
        System.out.println(z);
    }
}
