package L2.Examples;

public class QuizFindAverageForStudentTwo {

    public static void main(String[] args) {
        int[][] arr = {{30, 40, 59, 49}, {50, 50, 100, 100}, {45, 23, 65, 23}};
        int sum = 0;
        for (int i = 0; i < arr.length + 1; i++)
            sum += arr[1][i];
        System.out.println(sum / 4);

        sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == 1)
                    sum += arr[i][j];

            }
        }
        System.out.println(sum / 4);

    }
}
