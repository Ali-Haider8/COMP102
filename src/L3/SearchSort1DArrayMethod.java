package L3;

/*
Source: All-Questions-Second-Course.pdf
Q3: Write java program to create array x[]={20,30,5,2,1} have integer value
l- Pass x[] array to method Searchkey(x, key) to find key=5; then print index of it.
2- pass array to method Sortar() to array in Ascending order.
3- search key =5 before sort array and after sorting.
*/

import java.util.Arrays;

public class SearchSort1DArrayMethod {

    static int[] x = {20, 30, 5, 2, 1};

    static void SearchKey(int[] x, int key) {
        for (int i = 0; i < x.length; i++) {
            if (key == x[i]) {
                System.out.println("Key found at position " + i);
            }
        }
    }

    static void Sortat(int[] x) {
        int temp;
        for (int i = 0; i < x.length; i++) {
            for (int j = i + 1; j < x.length; j++) {
                if (x[i] > x[j]) {
                    temp = x[i];
                    x[i] = x[j];
                    x[j] = temp;
                }
            }
        }

        System.out.println("Array After Sorting: " + Arrays.toString(x));
    }

    public static void main(String[] args) {
        SearchKey(x, 5);
        Sortat(x);
        SearchKey(x, 5);
    }
}
