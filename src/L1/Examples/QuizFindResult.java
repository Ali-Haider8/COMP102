package L1.Examples;

public class QuizFindResult {

    public static void main(String[] args) {

        int[] arr = {2, 4, 6, 8, 10, 12};

        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 4 == 0) {
                result = result + arr[i] / 2;
            } else if (arr[i] % 2 == 0) {
                result = result - arr[i];
            } else result = result + arr[i];

        }
        System.out.println(result);
    }
}
