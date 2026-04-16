package Other;

class JumpStatements {

    static void main() {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.print("Array: ");
        for (int n : arr) System.out.print(n + " ");

        System.out.print("\ncontinue when i = 3\n");
        for (int n : arr) {
            if (n == 3) {
                continue; // skip when i is 3
            }
            System.out.print(n + " ");
        }

        System.out.print("\nbreak when i = 3");
        System.out.println();
        for (int n : arr) {
            if (n == 3) {
                break; // exit loop when i is 3
            }
            System.out.print(n + " ");
        }

        System.out.print("\nReturn 0 when x or y less than 0\n");
        System.out.println("Sum: " + add(5, -1));
    }

    public static int add(int a, int b) {
        if (a < 0 || b < 0) {
            return 0; // Exit method early if invalid input
        }
        return a + b; // Return sum
    }
}
