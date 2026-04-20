package L1.Examples;

class ReplaceOddNumbersWithZero {

    static void main() {

        int[] arr = {1, 2, 3, 4, 5};
        System.out.print("Array: ");
        for (int x : arr) {
            System.out.print(x + " ");
        }

        // replace odd numbers with zero
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                arr[i] = 0;
            }
        }

        System.out.print("\nArray after replace odd numbers with zero: ");
        for (int x : arr) {
            System.out.print(x + " ");
        }

    }
}
