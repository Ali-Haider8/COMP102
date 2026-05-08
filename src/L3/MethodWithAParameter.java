package L3;

/*
Source: 2- Java Methods.pdf
*/

public class MethodWithAParameter {

    static void myMethod(String fname) {
        System.out.println(fname + " Refsnes");
    }

    public static void main(String[] args) {
        myMethod("Lima");
        myMethod("Jenny");
        myMethod("Anja");
    }
}
