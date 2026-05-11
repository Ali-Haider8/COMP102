package L3;

/*
Source:  (page 1 of 1)
*/

public class SecondLargestMethod {

    static int secondLargest(int[] arr) {
        int largeset = 0;
        int second_largest = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largeset) {
                second_largest = largeset;
                largeset = arr[i];
            } else if (arr[i] > second_largest) {
                second_largest = arr[i];
            }
        }
        return second_largest;
    }

    public static void main(String[] args) {
        int a[] = {10, 20, 4, 45, 99};
//        int a[] = {10,50,25};
        int result = secondLargest(a);

        System.out.println("Second Largest: " + result);
    }
}
