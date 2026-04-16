package L1;

import java.util.Scanner;
import java.util.Arrays;

class CheckElementFrequencyArrayLab {

    static void main() {

        System.out.print("Enter array size: "); // enter size
        Scanner sc = new Scanner(System.in); // initialize scanner
        int size = sc.nextInt();

        int[] arr = new int[size]; // initialize array
        System.out.print("Enter array elements: ");
        for (int i = 0; i < arr.length; i++) { // enter elements
            arr[i] = sc.nextInt();
        }
        sc.close(); // close scanner
        System.out.println("The elements of the array are: " + Arrays.toString(arr)); // print array

        for (int i = 0; i < arr.length; i++) {  // loop
            int count = 1;
            boolean isVisited = false;

            for (int j = i - 1; j >= 0; j--) { // check if visited or not loop
                if (arr[j] == arr[i]) {
                    isVisited = true;
                    break;
                }
            }

            if (isVisited) continue; // if same value >> skip current iteration

            for (int k = i + 1; k < arr.length; k++) {
                if (arr[k] == arr[i]) { // if same value is exist --> make count +1
                    count++;
                }
            }
            System.out.println(arr[i] + " -> " + count);
        }

    }
}
