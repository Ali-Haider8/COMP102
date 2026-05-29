package L4.HW;

/*
Q2: Write a program to count the number of words in a sentence.

Source: 2- JavaStringH.W2025.pdf (page 1 of 1)
*/

public class CountWordsNumberInSentence {

    static int WordsCount(String sentence) {
        String[] words = sentence.split("\\s");
        return words.length;
    }

    public static void main(String[] args) {
        String sentence = "java is a programming language";
        System.out.println(WordsCount(sentence));
    }
}
