package L3.HW;

/*
2- write code of java to sort x1[5], x2[4] using SortArr().

Source: 2- Java Methods.pdf
*/

public class SortArrayMethod {

    static void sortArr(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] x1 = {5, 7, 2, 8, 6};
        int[] x2 = {5, 3, 6, 3};

        sortArr(x1);
        for (int element : x1) System.out.print(element + " ");
        System.out.println();
        sortArr(x2);
        for (int element : x2) System.out.print(element + " ");
    }
}
