package L1.Examples;

class PositiveAndNegativeNumbersInArray {

    static void main() {

        int[] arr = {-3, -2, -1, 0, 1, 2, 3};
        System.out.print("Array: ");
        for (int x : arr) {
            System.out.print(x + " ");
        }

        System.out.print("\nPositive numbers in array: ");
        for (int x : arr) {
            if (x > 0) {
                System.out.print(x + " ");
            }
        }

        System.out.print("\nNegative numbers in array: ");
        for (int x : arr) {
            if (x < 0) {
                System.out.print(x + " ");
            }
        }
    }
}