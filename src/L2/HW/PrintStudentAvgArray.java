package L2.HW;

/*
Q2: create array of student grads(3*4), Sum all items of
second row only from 2D array.
*/

public class PrintStudentAvgArray {

    public static void main(String[] args) {
        int[][] arr = {
                {50, 84, 69, 87},
                {86, 46, 79, 93},
                {68, 48, 79, 49}
        };

        for (int i = 0; i < arr.length; i++) {
            double sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            System.out.println("Average for student " + (i + 1) + " is: " + (sum / arr[i].length));
        }
    }
}