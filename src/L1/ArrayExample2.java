package L1;
//  Example: Write a Java program to find the summation of the elements in an array
//then print out the square root of that summation.
public class ArrayExample2 {
    static void main(String[] args) {
        int[] numbers = {8, 2, 6, 4, 3};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++)
            sum = sum + numbers[i];

//        for (int number : numbers) sum = sum + number;

        System.out.println("The summation is: " + sum);
        System.out.println("The square root is: " + Math.sqrt(sum));
        System.out.println("The square is: " + (sum*sum));
    }
}