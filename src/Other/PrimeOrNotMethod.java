package Other;

/*
Source:  (page 1 of 1)
*/

public class PrimeOrNotMethod {

    static boolean primeOrNot(int n) {
        if (n <= 1) return false;
        for (int i = 2; i < Math.sqrt(n); i++)
            if (n % i == 0) return false;
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int x : arr)
            System.out.println("is " + x + " a prime number? " + "\nAnswer: " + primeOrNot(x));

    }
}
