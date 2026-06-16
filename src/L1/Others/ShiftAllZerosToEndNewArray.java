package L1.Others;

/*
Source:  (page 1 of 1)
*/

public class ShiftAllZerosToEndNewArray {

    public static void main(String[] args) {

        int[] arr = {0, 1, 0, 3, 12};

        int j = 0;
        int[] arr2 = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr2[j] = arr[i];
                j++;
            }
        }
        for (int n : arr2) {
            System.out.print(n + " ");
        }

    }
}
