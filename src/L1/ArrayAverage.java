package L1;

public class ArrayAverage {

    public static void main(String[] args) {
        double[] array = {22.4, 13.3, 9.5, 6, 10.3};
        double sum = 0;

//        for (int c = 0; c < array.length; c++)
//            sum = sum + array[c];

        for (double v : array) sum += v;

        double arrayAvg = (sum / array.length);
        System.out.println("The average = " + arrayAvg);
    }
}
