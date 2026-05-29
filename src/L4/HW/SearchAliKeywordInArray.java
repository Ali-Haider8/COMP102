package L4.HW;

/*
Q4: Write java program to read string array from keyboard then check word=”Ali”
found or not in array

Source: 2- JavaStringH.W2025.pdf (page 1 of 1)
*/

import java.util.Scanner;

public class SearchAliKeywordInArray {

    static boolean searchKeyword(String[] arr, String keyword) {
        for (String s : arr)
            if (s.equalsIgnoreCase(keyword)) return true;
        return false;
    }

    public static void main(String[] args) {
        String[] arr = new String[3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 names");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter " + (i + 1) + " name: ");
            arr[i] = sc.nextLine();
        }
        sc.close();

        System.out.println("Is Ali in array -> " + searchKeyword(arr, "ali"));
    }
}
