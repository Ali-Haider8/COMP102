package L3;

//Source: 3- Java Methods.pdf
public class FindSumAndMultiplicationMethod {

    static float AvNumbers(int a, int b) {
        int Av = (a + b) / 2;
        return Av;
    }

    static int multiNumbers(int num1, int num2) {
        int mul = num1 * num2;
        return mul;
    }

    public static void main(String[] args) {
        float av = AvNumbers(5, 2);
        int mul = multiNumbers(5, 5);
        System.out.println("Average = " + av);
        System.out.println("Multiplication = " + mul);
    }
}
