package L1.HW;

// 6. Create array (10, 20, 4, 45, 99) then , Find Second Largest Element Without Sorting:
public class SecondLargestElementWithoutSorting {

    public static void main(String[] args) {

        int[] arr = {10, 20, 4, 45, 99};

        int largestNumber = arr[0];
        int secondLargestNumber = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > largestNumber) {
                secondLargestNumber = largestNumber;
                largestNumber = arr[i];

            } else if (arr[i] > secondLargestNumber && arr[i] != largestNumber) {
                secondLargestNumber = i;
            }

        }

        System.out.println("Second Largest Number is: " + secondLargestNumber);


    }
}
