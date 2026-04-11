package L1.HW;

import java.util.Scanner;
//  5. Create array from Key board then Sum of All Elements:
public class SumAllArrayElements {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int arraySize = sc.nextInt();

        int[] numbers = new int[arraySize];

        System.out.print("Enter array elements: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        int sum = 0;
        for (int x : numbers) {
            sum = sum + x;
        }

        System.out.println("Sum of all array elements is: " + sum);


    }
}
