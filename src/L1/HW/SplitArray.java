package L1.HW;
//  4. Create array (1, 2, 3, 4, 5, 6) then Split an Array into Two Halves:
public class SplitArray {

    static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6};

        int[] firstHalf = new int[3];
        int[] secondHalf = new int[3];

        System.out.print("Original array: ");
        for (int x : numbers) {
            System.out.print(x + " ");
        }

        System.arraycopy(numbers, 0, firstHalf, 0, firstHalf.length);

        System.arraycopy(numbers, 3, secondHalf, 0, secondHalf.length);

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
