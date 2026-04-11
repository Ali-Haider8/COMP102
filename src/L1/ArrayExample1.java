package L1;
/* Java program to illustrate creating an array of type double and
print each element with its index */
public class ArrayExample1 {

    static void main() {
        double[] array = {22.4, 13.3, -6.5, 9};

        for (int c = 0; c < array.length; c++) {
            System.out.println("Element at index " + c + " = " + array[c]);
        }
    }
}
