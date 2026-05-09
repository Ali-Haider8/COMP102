package L1.Examples;

// How to declare, initialize and access array?
public class CreateArray {
    public static void main(String[] args) {

//        int[] values;
//        int values2[];
//        double[] c = new double[5];
//        double c2[] = new double[5];

//        int[] values3 = {12, 24, -23, 47};

//        int[] values4 = new int[12];
//        int num = values4.length;
//        System.out.println(num);

//        int num2 = values3.length;
//        System.out.println(num2);

//        System.out.println(values3[3]);
//        values3[3] = 18;
//        System.out.println(values3[3]);

//        int z = values3[1] + 3; // 24+3
//        System.out.println(z);

//        int[] values = {1, 2.5, 3, 3.5, 4}; // 2.5, 3.5 in int[]
//        char[] array = {'a','*','4','/'};
//        System.out.println(array[4]); // ArrayIndexOutOfBoundException Error
//        int[] values = {12, 24, -23, 47};
//        for (int i = 0; i < values.length; i++)
//            System.out.print(values[i] + " ");

//        for (int value : values) System.out.print(value + " ");

        int[] values = {12, 24, -23, 47};
        int i = 0;
        while (i < values.length) {
            System.out.print(values[i] + " ");
            i++;
        }



    }
}
