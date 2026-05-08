package L3;

//3- Java Methods.pdf
public class FindSumOfTwoNumbersMethod {

    // create a method
    static int addNumbers(int num1, int num2) {
        int Add = num1 + num2;
        return Add;
    }

    public static void main(String[] args) {
        int sum;
        int a = 25;
        int b = 2;
        sum = addNumbers(a, b);
        System.out.println("Sum = " + sum);

    }
}
