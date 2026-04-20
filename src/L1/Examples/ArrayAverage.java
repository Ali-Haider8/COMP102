package L1.Examples;
//  Example 4: Write a Java program to print the average of numbers in an array.
public class ArrayAverage {

    static void main(String[] args) {
        double[] array = {22.4, 13.3, 9.5, 6, 10.3};
        double sum = 0;

//        for (int c = 0; c < array.length; c++)
//            sum = sum + array[c];

        for (double v : array) sum += v;

        double arrayAvg = (sum / array.length);
        System.out.println("The average = " + arrayAvg);
    }
}
