package L1.HW;

public class SplitArray {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6};

        int[] firstHalf = new int[3];
        int[] secondHalf = new int[3];

        System.out.print("Original array: ");
        for (int x : numbers) {
            System.out.print(x + " ");
        }

        for (int i = 0; i < firstHalf.length; i++) {
            firstHalf[i] = numbers[i];
        }

        for (int i = 0; i < secondHalf.length; i++) {
            secondHalf[i] = numbers[i + 3];
        }

        System.out.println();
        System.out.print("First array: ");
        for (int x : firstHalf) {
            System.out.print(x + " ");
        }

        System.out.println();
        System.out.print("Second Half: ");
        for (int x : secondHalf) {
            System.out.print(x + " ");
        }
    }
}
