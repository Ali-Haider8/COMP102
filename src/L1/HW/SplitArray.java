package L1.HW;

/*
4. Create array (1, 2, 3, 4, 5, 6) then Split an Array into Two Halves:

Source: 4- 1D Array H.W 2026.pdf (page 1 of 2)
*/

public class SplitArray {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6};

        int[] arr1 = new int[arr.length / 2];
        int[] arr2 = new int[arr.length / 2];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = arr[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = arr[i + arr1.length];
        }

        System.out.print("Array A: ");
        for (int x : arr1) System.out.print(x + " ");

        System.out.print("\nArray B: ");
        for (int x : arr2) System.out.print(x + " ");

    }
}
