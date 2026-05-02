package L3;

/*
Write java program to create
avstudent(st[],d[][]) to find the sum and
av for the following arryas of students
Ali 10, 10,20
Moh 20,100,50
Hassan 100,1 00,100
*/

public class avStudentArrayMethod {

    public static void main(String[] args) {
        String[] students = {"Ali", "Moh", "Hassan"};
        int[][] grades = {{10, 10, 20}, {20, 100, 50}, {100, 100, 100}};
        avstudent(students, grades);
    }

    static void avstudent(String[] names, int[][] grades) {
        for (int i = 0; i < names.length; i++) {
            int sum = 0;
            for (int j = 0; j < grades[i].length; j++) {
                sum += grades[i][j];
            }
            System.out.println("Name: " + names[i] + " - Sum: " + sum + " - Average: " + (sum / names[i].length()));
        }
    }
}
