package L1.HW;

/*
Q> Write a Java program to sort names of an array in an alphabetical order.

Source: 2- One-dimensional Array Examples.pdf (page 4 of 4)
*/

public class SortArrayAlphabeticalOrder {

    public static void main(String[] args) {

        String[] arr = {"Zuhair", "Eman", "Ali", "Baqir"};
        sortAlphabeticalOrder(arr);
        for (String n : arr) System.out.print(n + " ");


    }

    static void sortAlphabeticalOrder(String[] arr) {
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
    }

}
