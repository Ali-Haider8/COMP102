package L2.Examples;

public class QuizFindAverageForStudentTwo {

    public static void main(String[] args) {
        int[][] arr = {{30, 40, 59, 49}, {54, 45, 76, 45}, {45, 23, 65, 23}};
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
            sum += arr[1][i];
        System.out.println(sum / 4);
    }
}
