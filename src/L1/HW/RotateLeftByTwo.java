package L1.HW;

/*
8. Create array then rotate Array to Left by Given Positions =2

Source: 4- 1D Array H.W 2026.pdf (page 1 of 2)
*/

public class RotateLeftByTwo {


    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        int first = arr[0];
        for (int r = 0; r < 2; r++) {
            for (int i = 0; i < arr.length - 1; i++) arr[i] = arr[i + 1];
            arr[arr.length - 1] = first;
        }

        System.out.print("Array after left rotation: ");
        for (int number : arr) System.out.print(number + " ");

    }
}
