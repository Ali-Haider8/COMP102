package L1.Examples;
//  Example 6: Write a Java program to sort the items of an array in ascending order.
public class ArrayAscendingOrder {

    static void main(String[] args) {

        double[] array = {22.4, 13.3, 9.5, 6, 10.3};
        double temp;

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        System.out.print("Ascending Order: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }
}
