package L1.HW;

public class ArrayIndexOutOfBoundExceptionArray {

    public static void main(String[] args) {

        char[] array = {'a', '*', '4', '/'};
//        System.out.println(array[4]); // array index start from 0 ... end with 3 >> ArrayIndexOutOfBoundException
        System.out.println(array[3]);
    }
}
