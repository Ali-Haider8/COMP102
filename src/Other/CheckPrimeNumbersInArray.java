package Other;

public class CheckPrimeNumbersInArray {

    static void main() {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int num : arr) {

            boolean isPrime = num > 1;

            for (int j = 2; j * j <= num; j++) {
                if (num % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            System.out.println(num + " is prime = " + isPrime);
        }


    }
}