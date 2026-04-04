package L1.HW;

public class ShiftAllZerosEndArray {

    public static void main(String[] args) {
        int[] numbers = {0, 1, 0, 3, 12};
        int index = 0;

        System.out.print("The Array Elements Before Shifting: ");

        for (int number : numbers) {
            System.out.print(number + " ");
        }

        System.out.println();
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != 0) {
                numbers[index] = numbers[i];
                index++;
            }
        }

        while (index < numbers.length) {
            numbers[index] = 0;
            index++;
        }

        System.out.print("The Array Elements After Shifting: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }

    }
}
