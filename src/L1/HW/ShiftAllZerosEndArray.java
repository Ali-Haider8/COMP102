package L1.HW;

/*
2. Create integer array (0, 1, 0, 3, 12) then Shift All Zeroes to the End:

Source: 4- 1D Array H.W 2026.pdf (page 1 of 2)
*/

public class ShiftAllZerosEndArray {

    static void shiftZerosToEnd(int[] arr) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }
        while (index < arr.length) {
            arr[index] = 0;
            index++;
        }
    }

    public static void main(String[] args) {
        int[] numbers = {0, 1, 0, 3, 12};
        shiftZerosToEnd(numbers);

        System.out.print("The Array Elements After Shifting: ");
        for (int number : numbers) System.out.print(number + " ");

    }
}
