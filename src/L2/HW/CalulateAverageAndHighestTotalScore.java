package L2.HW;

/*
Q4: create 2D array have 3*4 , row represent student and
columns represent Grads , do the following.
  Calculate each student's average
  Find the student with the highest total score
*/

import java.util.Scanner;

public class CalulateAverageAndHighestTotalScore {

    public static void main(String[] args) {
        int rows = 3;
        int columns = 4;
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            System.out.print("Enter 4 Grades for Student " + (i + 1) + ": ");
            for (int j = 0; j < columns; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();

        System.out.println();
        System.out.println("Students Average");
        System.out.println("---------------");
        double higestScoreStudentID = 0;
        int studentID = 0;
        double studentAverage;
        for (int i = 0; i < rows; i++) {
            double sum = 0;
            for (int j = 0; j < columns; j++) {
                sum += arr[i][j];
            }
            studentAverage = sum / columns;
            System.out.println("Student " + (i + 1) + " Average is: " + studentAverage);
            if (studentAverage > higestScoreStudentID) {
                higestScoreStudentID = studentAverage;
                studentID = (i + 1);
            }

        }

        System.out.println();
        System.out.println("Student with Highest Total Score");
        System.out.println("---------------");
        System.out.println("The Student number: " + studentID);

    }
}
