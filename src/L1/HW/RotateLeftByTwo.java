package L1.HW;

/*
8. Create array then rotate Array to Left by Given Positions =2

Source: 4- 1D Array H.W 2026.pdf (page 1 of 2)
*/

public class RotateLeftByTwo {


    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        for (int r = 0; r < 2; r++) {
            int first = numbers[0];
            for (int i = 0; i < numbers.length - 1; i++) {
                numbers[i] = numbers[i + 1];
            }
            numbers[numbers.length - 1] = first;
        }


        System.out.print("Array after left rotation: ");
        for (int number : numbers) System.out.print(number + " ");

    }
}
