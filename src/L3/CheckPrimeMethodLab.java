package L3;

public class CheckPrimeMethodLab {

    public static void main(String[] args) {
        int number = 7;
        if (isPrime(number)) {
            System.out.println(number + " is a prime number");
        } else if (!isPrime(number)) {
            System.out.println(number + " is not a prime number");
        }
    }

    private static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
}
