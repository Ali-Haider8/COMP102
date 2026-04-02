package L1.HW;

public class FindMaxAndMainArray {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 60, 70, 30};

        int max = numbers[0];
        int min = numbers[numbers.length - 1];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);

    }
}
