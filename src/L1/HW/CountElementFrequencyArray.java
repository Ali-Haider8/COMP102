package L1.HW;

public class CountElementFrequencyArray {

    public static void main(String[] args) {

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
