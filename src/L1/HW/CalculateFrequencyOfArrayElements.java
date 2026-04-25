package L1.HW;

public class CalculateFrequencyOfArrayElements {

    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 3, 3};

        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            boolean visited = false;

            for (int j = i - 1; j >= 0; j--) {
                if (arr[i] == arr[j]) {
                    visited = true;
                    break;
                }
            }

            if (visited) {
                continue;
            }

            for (int k = i + 1; k < arr.length; k++) {
                if (arr[i] == arr[k]) {
                    count = count + 1;
                }
            }
            System.out.println(arr[i] + " -> " + count);
        }

    }
}
