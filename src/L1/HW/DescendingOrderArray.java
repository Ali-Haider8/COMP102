package L1.HW;

/*
Q> Write a Java program to sort the items of an array in descending order.

Source: 2- One-dimensional Array Examples.pdf (page 4 of 4)
*/

@SuppressWarnings("DuplicatedCode")
public class DescendingOrderArray {

    public static void main(String[] args) {

        int[] numbers = {4, 3, 2, 8};
        sortDesendingOrder(numbers);
        for (int number : numbers) System.out.print(number + " ");


    }

    static void sortDesendingOrder(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}