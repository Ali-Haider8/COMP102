package L1.HW;

/*
Q> Write a Java program to print the prime numbers in an array

Source: 2- One-dimensional Array Examples.pdf (page 4 of 4)
*/

public class PrintPrimeNumbersArray {

    public static void main(String[] args) {
        int[] arr = {3, 5, 6, 4, 7};
        for (int number : arr)
            if (isPrime(number)) System.out.println(number + " is prime.");

    }

    static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

}