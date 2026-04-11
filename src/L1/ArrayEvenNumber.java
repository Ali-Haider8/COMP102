package L1;
//  Example 3: Write a Java program to print even numbers in an array.
public class ArrayEvenNumber {

    static void main(String[] args) {
        int[] numbers = {5, 2, 6, 3, 4};
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0)
                System.out.println(numbers[i]);
        }
    }
}
