package L1;

class ReplaceEvenNumbersWithZero {

    static void main() {

        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Array: ");

        for (int x : arr) {
            System.out.print(x + " ");
        }

        // replace even numbers with zero
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arr[i] = 0;
            }
        }


        System.out.print("\nArray after replace even numbers with zero: ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
