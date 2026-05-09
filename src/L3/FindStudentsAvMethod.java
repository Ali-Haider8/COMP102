package L3;

/*
Q3: Write java program to create avstudent(st[].d[][]) to find the av for each student for the
following arrays of students Names and grades.
Mohamed   10   40   20
Ali       20   100  50
Jaafar    100  100  100

Source: All-Questions-Second-Course.pdf (page 10 of 24)
*/

public class FindStudentsAvMethod {

    private static void avstudent(String[] st, int[][] d) {
        for (int i = 0; i < d.length; i++) {
            int sum = 0;
            for (int j = 0; j < d[i].length; j++) {
                sum += d[i][j];
            }
            double avg = (double) sum / d[i].length;
            avg = Math.round(avg);
            System.out.println(st[i] + " av is " + avg);
        }
    }

    public static void main(String[] args) {
        String[] st = {"Mohammed", "Ali", "Jaafar"};
        int[][] d = {{10, 40, 20}, {20, 100, 50}, {100, 100, 100}};
        avstudent(st, d);

    }
}
