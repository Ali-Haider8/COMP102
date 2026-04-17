package L2;
import java.util.Arrays;
class LengthAttribute {

    static void main() {
        int[][] array = new int[12][8]; // a 12x8 array of int
        System.out.println(array.length); // 12 number of rows
        System.out.println(array[0].length); // 8 number of columns
        System.out.println(array[11].length); // 8 number of columns
    }
}
