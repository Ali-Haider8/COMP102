package L1.HW;

/*
1. Create integer array (1, 2, 2, 3, 3, 3) Count Frequency of Each Element:

Source: 4- 1D Array H.W 2026.pdf (page 1 of 2)
*/

public class CountElementFrequencyArray {

    static void checkFrequency(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            boolean isVisited = false;

            for (int j = i - 1; j >= 0; j--) {
                if (arr[i] == arr[j]) {
                    isVisited = true;
                    break;
                }
            }
            if (isVisited) continue;

            for (int k = i + 1; k < arr.length; k++) {
                if (arr[i] == arr[k]) count++;
            }
            System.out.println(arr[i] + " -> " + count);
        }
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 2, 3, 3, 3};
        checkFrequency(numbers);
    }
}
