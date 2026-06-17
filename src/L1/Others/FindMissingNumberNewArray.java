package L1.Others;

/*
9. Create array from the keyboard then print the array from second position after
that Find Missing number in Consecutive Integers:

Source: 4- 1D Array H.W 2026.pdf (page 1 of 2)
*/

public class FindMissingNumberNewArray {

    static void findMissingNumber(int[] arr) {
        int expectedSum = 0;
        for (int i = arr[0]; i <= arr[arr.length - 1]; i++)
            expectedSum += i;

        int actualSum = 0;
        for (int i = 0; i < arr.length; i++)
            actualSum += arr[i];

        int missingNumber = expectedSum - actualSum;
        System.out.println("Missing Number = " + missingNumber);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6};
        findMissingNumber(arr);

    }
}
