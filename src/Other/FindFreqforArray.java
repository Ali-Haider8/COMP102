package Other;

/*
Source:  (page 1 of 1)
*/

public class FindFreqforArray {

    static void findFreq(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            boolean visited = false;

            for (int j = i - 1; j >= 0; j--) {
                if (arr[i] == arr[j]) {
                    visited = true;
                    break;
                }
            }
            if (visited) continue;

            for (int k = 0; k < arr.length; k++) {
                if (arr[i] == arr[k]) {
                    count++;
                }
            }

            System.out.println(arr[i] + " -> " + count);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 3};
        findFreq(arr);
    }
}
