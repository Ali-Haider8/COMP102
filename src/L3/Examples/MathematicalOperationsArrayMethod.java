package L3.Examples;

/*
Q4: Write a Java program to create array Op[]={+, -, *, /, ^} then
apply all these mathematical operations on variables (A, B).

Source: final-exams-csklawat.pdf (page 8 of 18)
*/

public class MathematicalOperationsArrayMethod {

    public static void main(String[] args) {
        char[] Op = {'+', '-', '*', '/', '^'};
        int A = 10, B = 5;
        for (char op : Op) {
            switch (op) {
                case '+':
                    System.out.println("A + B = " + (A + B));
                    break;
                case '-':
                    System.out.println("A - B = " + (A - B));
                    break;
                case '*':
                    System.out.println("A * B = " + (A * B));
                    break;
                case '/':
                    System.out.println("A / B = " + (A / B));
                    break;
                case '^':
                    System.out.println("A ^ B = " + (int) Math.pow(A, B));
                    break;

            }
        }
    }
}
