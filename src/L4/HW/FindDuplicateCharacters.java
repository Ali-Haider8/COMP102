package L4.HW;

/*
Q1: Write a program to find and print duplicate characters in a string.

Source: 2- JavaStringH.W2025.pdf (page 1 of 1)
*/

public class FindDuplicateCharacters {

    static void printDuplicateCharacters(String text) {
        text = text.toLowerCase();
        System.out.println(text);
        char[] arr = text.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            if (arr[i] == '0') continue;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    arr[j] = '0';
                }
            }
            if (count > 1 && arr[i] != ' ')
                System.out.println(arr[i] + " -> repeated " + count + " times");

        }
    }

    static void findDuplicateCharacters(String text) {
//        String[] words = text.split("\\s");
//        text = text.trim();
        char[] ch = text.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            int count = 0;
            boolean visited = false;
            for (int j = i - 1; j >= 0; j--) {
                if (ch[i] == ch[j]) {
                    visited = true;
                    break;
                }
            }
            if (visited) continue;
            for (int k = i + 1; k < ch.length; k++) {
                if (ch[k] == ch[i] && ch[i] != ' ') count++;
            }
            if (count > 0) System.out.println(ch[i] + " -> " + count);
        }
    }

    public static void main(String[] args) {
        findDuplicateCharacters(" java for all "); // output: a -> 1
    }
}
