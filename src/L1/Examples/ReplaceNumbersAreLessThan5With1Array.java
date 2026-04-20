package L1.Examples;

class ReplaceNumbersAreLessThan5With1Array {

    static void main() {

        int[] arr = {-2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println("Array: ");
        for (int x : arr) {
            System.out.print(x + " ");
        }

        // replace numbers less than 5 with
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 5) {
                arr[i] = 1;
            }
        }

        System.out.print("\nArray after replace numbers less than 5 with 1: ");
        for (int x : arr) {
            System.out.print(x + " ");
        }

    }
}
