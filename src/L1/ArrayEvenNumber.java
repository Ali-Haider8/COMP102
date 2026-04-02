package L1;

public class ArrayEvenNumber {

    public static void main(String[] args) {
        int[] numbers = {5, 2, 6, 3, 4};
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0)
                System.out.println(numbers[i]);
        }
    }
}
