package L1.HW;

/*
Q> Write a Java program to count the number of occurrences of an element in an
//  array.

Source: 2- One-dimensional Array Examples.pdf (page 4 of 4)
*/

public class ElementOccurrencesInArray {

    public static void main(String[] args) {

        int[] arr = {3, 5, 6, 3, 7};
        int element = 3;

        int occurrences = 0;
        for (int number : arr)
            if (number == element)
                occurrences++;

        System.out.println("Occurrences for " + element + " is: " + occurrences);

    }
}
