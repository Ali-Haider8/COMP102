package L4.Others;

/*
ex1: use suitable method of string in this code

Source: 1- JavaString2025.pdf (page 18 of 19)
*/

import java.util.Scanner;

public class UseSuitableMethod {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the city name: ");
        String city = sc.nextLine();
        sc.close();

        switch (city) {
            case "Meerut":
                System.out.println("Meerut");
                break;
            case "Noida":
                System.out.println("Noida");
                break;
            case "Agra":
                System.out.println("Agra");
                break;
            default:
                System.out.println("Delhi");
        }

    }
}
