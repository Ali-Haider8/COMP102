package L1.Examples;

import java.util.Arrays;

public class ReverseArrayLogic {

    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 1, 5, 9};
        int sum = 0;

        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        // arr = {9, 5, 1, 4, 1, 3}
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                sum += arr[i] * 2;
            } else {
                sum -= arr[i];
            }
        }
        // i = 0 (even) -> 0 + (9 * 2) = 18
        // i = 1 (odd) -> 18 - 5 = 13
        // i = 2 (evem) -> 13 + (1 * 2) = 15
        // i = 3 (odd) -> 15 - 4 = 11
        // i = 4 (even) -> 11 + (1 * 2) = 13
        // i = 5 (odd) -> 13 - 3 = 10

        System.out.println("Sum: " + sum);
    }
}
