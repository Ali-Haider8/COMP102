package L1.HW;
// 1. Create integer array (1, 2, 2, 3, 3, 3) Count Frequency of Each Element:
public class CountElementFrequencyArray {

    static void main(String[] args) {

        int[] numbers = {1, 2, 2, 3, 3, 3};
        int num1Frequency = 0, num2Frequency = 0, num3Frequency = 0;

        for (int number : numbers) {
            switch (number) {
                case 1:
                    num1Frequency++;
                    break;
                case 2:
                    num2Frequency++;
                    break;
                case 3:
                    num3Frequency++;
                    break;
            }
        }

        System.out.println("Frequency for Element 1: " + num1Frequency);
        System.out.println("Frequency for Element 2: " + num2Frequency);
        System.out.println("Frequency for Element 3: " + num3Frequency);
    }
}
