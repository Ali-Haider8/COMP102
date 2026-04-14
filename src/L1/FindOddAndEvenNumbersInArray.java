package L1;

class FindOddAndEvenNumbersInArray {

    static void main() {

        int[] arr = {1, 2, 3, 4, 5};
        System.out.print("Array: ");
        for (int x : arr) {
            System.out.print(x + " ");
        }

        System.out.print("\nOdd numbers in array: ");
        for (int x : arr) {
            if (x % 2 != 0) {
                System.out.print(x + " ");
            }
        }

        System.out.print("\nEven numbers in array: ");
        for (int x : arr) {
            if (x % 2 == 0) {
                System.out.print(x + " ");
            }
        }

    }
}
