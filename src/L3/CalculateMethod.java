package L3;

/*
Source: 1- Java Methods.pdf
*/

public class CalculateMethod {

    static int num1 = 25;
    static int num2 = 2;

    // create a method
    static void addNumbers() {
        int sum = num1 + num2;
        System.out.println("sum = " + sum);
    }

    static void multiplyNumbers() {
        int mul = num1 * num2;
        System.out.println("mul = " + mul);
    }

    public static void main(String[] args) {
        // call method
        addNumbers();
        multiplyNumbers();
    }
}
