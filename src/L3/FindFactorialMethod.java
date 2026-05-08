package L3;

/*
Source: 3- Java Methods.pdf
*/

public class FindFactorialMethod {

    static int fact(int n) {
        int fact = 1;
        for (int i = 1; i <= n; ++i)
            fact *= i;
        return fact;
    }

    public static void main(String[] args) {
        int number = 5;
        int result = fact(number);
        System.out.println("Factorial " + number + " = " + result);

    }
}
