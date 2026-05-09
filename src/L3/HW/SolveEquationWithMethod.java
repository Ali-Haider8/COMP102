package L3.HW;

/*
4- Create method for sum() and div1() to solve this equation
y = ( ∑_{i=0}^{10} f(x) ) / ( ∑_{i=0}^{10} f(x) + c )

Source: 4- H.W Methods using Java 2025.pdf (page 1 of 1)
*/

public class SolveEquationWithMethod {

    public static double f(int x) {
        return x;
    }

    static double sum() {
        int total = 0;
        for (int i = 0; i <= 10; i++) {
            total += f(i);
        }
        return total;
    }

    static double div1(int c) {
        double s = sum();
        return s / (s + c);
    }

    public static void main(String[] args) {
        int c = 4;
        double y = div1(c);
        System.out.println("y = " + y);
    }
}
