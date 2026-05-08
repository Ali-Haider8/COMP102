package L3.HW;
/*
1- Write java code to create a method to check if a number is   Boolean
prime(num).

Source: 4- H.W Methods using Java 2025.pdf
*/

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
