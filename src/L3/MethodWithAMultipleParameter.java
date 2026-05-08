package L3;
/*
Source: 2- Java Methods.pdf
*/

public class MethodWithAMultipleParameter {

    static void myMethod(String fname, int age) {
        System.out.println(fname + " is " + age);
    }

    public static void main(String[] args) {
        myMethod("Lima", 5);
        myMethod("Jenny", 8);
        myMethod("Anja", 31);
    }
}
