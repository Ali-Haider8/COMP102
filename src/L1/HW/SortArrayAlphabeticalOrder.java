package L1.HW;

import java.util.Arrays;

//Q> Write a Java program to sort names of an array in an alphabetical order.
public class SortArrayAlphabeticalOrder {

    public static void main(String[] args) {

        String[] arr = {"Zuhair", "Eman", "Ali", "Baqir"};

        String temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i].charAt(0) < arr[j].charAt(0)) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (String n : arr) {
            System.out.print(n + " ");
        }

    }
}
