package L1.HW;

public class SecondLargestElementWithoutSorting {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 4, 45, 99};

        int largestNumber = numbers[0];
        int secondLargestNumber = numbers[0];

        for (int num : numbers) {
            if (num > largestNumber) {
                secondLargestNumber = largestNumber;
                largestNumber = num;
            } else if (num > secondLargestNumber && num != largestNumber) {
                secondLargestNumber = num;
            }
        }

        System.out.println("Second Largest Number is: " + secondLargestNumber);


    }
}
