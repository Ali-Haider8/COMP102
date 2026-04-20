package L1.Examples;
//Q4/ Wrlte java program to create 1d array has 5 grades tor students , count failed degree
//Read items Of array from Keyboard using (while)

import java.util.Scanner;

class CountFailedDegree {

    static void main() {
        Scanner sc = new Scanner(System.in);

        int[] grades = new int[5];
        int i = 0;
        while (i < grades.length) {
            System.out.print("Enter " + (i + 1) + " grade: ");
            grades[i] = sc.nextInt();
            i++;
        }

        int c = 0;
        int failed = 0;
        while (c < grades.length) {
            if (grades[c] < 50) {
                failed++;
            }
            c++;
        }

        System.out.println("\nFailed degrees count is: " + failed);


    }
}
