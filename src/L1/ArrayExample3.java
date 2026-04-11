package L1;

import java.util.Scanner;
// Java Example Read and Print Array
public class ArrayExample3 {

    static void main(String[] args) {
        int size;
        int[] items;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the numbers of items (size of array): ");
        size = in.nextInt();

        items = new int[size];
        System.out.print("Enter the value of all items (separated by space): ");

        for (int i = 0; i < items.length; i++)
            items[i] = in.nextInt();

        in.close();

        System.out.print("The array contains: ");
        for (int i = 0; i < items.length; i++)
            System.out.print(items[i] + " ");

    }
}
