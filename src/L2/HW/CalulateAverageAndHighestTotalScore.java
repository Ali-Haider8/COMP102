package L2.HW;

/*
Q4: create 2D array have 3*4 , row represent student and
columns represent Grads , do the following.
  Calculate each student's average
  Find the student with the highest total score

Source: 3- H.W. 2D array using java 2025.pdf (page 1 of 1)
*/

public class CalulateAverageAndHighestTotalScore {

    public static void main(String[] args) {
        int[][] arr = {
                {50, 84, 69, 87},
                {86, 46, 79, 93},
                {68, 48, 79, 49}
        };

        double higestScoreStudentID = 0;
        int studentID = 0;
        int studentAverage;
        for (int i = 0; i < arr.length; i++) {
            double sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            studentAverage = (int) sum / arr.length;
            System.out.println("Student " + (i + 1) + " Average is: " + studentAverage);
            if (studentAverage > higestScoreStudentID) {
                higestScoreStudentID = studentAverage;
                studentID = (i + 1);
            }

        }

        System.out.println();
        System.out.println("Student with Highest Total Score: " + studentID);

    }
}
