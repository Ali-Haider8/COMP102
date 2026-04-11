package Other;

import java.util.Scanner;

public class IntToChar {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter int: ");
        int a = sc.nextInt();
        char z = (char) a;
        System.out.println(z);
    }
}
