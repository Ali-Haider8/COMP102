package L3;

/*
Q1:- Write ( True ) or ( False & Correct it )
1- All the items of array have diffrent datatype.
2- When call method should be has same number of parameters and different data type.
3- The indexes ot-the array start with zero always
4- The lengths of the rows in 21) array are required to be the same.
5- Sqrt is a method of Scanner class.
*/

import java.util.Scanner;

public class TrueOrFalseQuestionsAboutMethods {

    private static String[] questions;
    private static String[] explanations;
    private static boolean[] trueAnswers;

    public static void main(String[] args) {
        initializeQuizData();
        runQuiz();
    }

    public static void initializeQuizData() {
        questions = new String[]{
                "1- All the items of array have diffrent datatype.",
                "2- When call method should be has same number of parameters and different data type.",
                "3- The indexes ot-the array start with zero always",
                "4- The lengths of the rows in 2D array are required to be the same.",
                "5- Sqrt is a method of Scanner class."
        };
        explanations = new String[]{
                "All items of array should have same dateType.",
                "When call method should be has same number of parameters and same dataTypes and same name.",
                "index start with zero; so if we have 6 items, last index is 5.",
                "2D array can be ragged array.",
                "Sqrt is a method of Math class, nextInt is a method of Scanner class."
        };
        trueAnswers = new boolean[]{false, false, true, false, false};
    }

    public static void runQuiz() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < questions.length; i++) {
            displayQuestion(i);
            boolean userAnswer = getUserAnswer(sc);
            checkAndProvideFeedBack(userAnswer, trueAnswers[i], explanations[i]);
        }
    }

    public static void displayQuestion(int index) {
        System.out.println(questions[index]);
        System.out.print("True or False: ");
    }

    public static boolean getUserAnswer(Scanner sc) {
        return sc.nextBoolean();
    }

    public static void checkAndProvideFeedBack(boolean userAnswer, boolean correctAnswer, String explanation) {
        if (userAnswer == correctAnswer) {
            System.out.println("Your Answer is correct");
        } else {
            System.out.println("Your Answer is incorrect");
        }
        System.out.println(explanation);
        System.out.println();
    }
}
