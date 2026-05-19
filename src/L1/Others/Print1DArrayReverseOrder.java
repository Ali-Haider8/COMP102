package L1.Others;

/*
Source: 6- two-dimension-array-examples-batool.pdf (page 19 of 26)
*/

public class Print1DArrayReverseOrder {

    public static void main(String[] args) {

        int[] arr = {2, 3, 4, 5};

        for (int i = arr.length - 1; i >= 0; i--)
            System.out.print(arr[i] + " ");

    }
}
