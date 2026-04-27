package L2.Examples;
/*
Q2: Write java program to create 2D array 3x4
rows for students and columns for grades of topie
*/

public class SecondTopicFailedStudents {

    public static void main(String[] args) {
        int arr[][] = {{30, 23, 23, 76}, {34, 50, 76, 54}, {65, 45, 34, 87}};

        for (int i = 0; i < arr.length; i++) {
            boolean isFailed = false;
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][1] < 50) isFailed = true;
            }
            if (isFailed) System.out.println("Student " + (i + 1) + " Failed in second topic.");
        }
    }
}
