package L1.HW;

//  4. Create array (1, 2, 3, 4, 5, 6) then Split an Array into Two Halves:
@SuppressWarnings("ManualArrayCopy")
public class SplitArray {

    static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int[] A = new int[numbers.length / 2];
        int[] B = new int[numbers.length / 2];

        System.out.print("Original array: ");
        for (int x : numbers) {
            System.out.print(x + " ");
        }

        for (int i = 0; i < (numbers.length / 2); i++) {
            A[i] = numbers[i];
        }

        for (int i = 5; i < numbers.length; i++) {
            B[i - 5] = numbers[i];
        }

        System.out.print("\nArray A: ");
        for (int x : A) {
            System.out.print(x + " ");
        }

        System.out.print("\nArray B: ");
        for (int x : B) {
            System.out.print(x + " ");
        }
    }
}
