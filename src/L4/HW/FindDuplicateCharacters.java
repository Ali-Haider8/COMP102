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
        char[] ch = text.toCharArray();
        for (int i=0;i<ch.length;i++){
            for (int j=i+1;j<ch.length;j++){
                if (ch[i]==ch[j]){
                    System.out.println(ch[i]+ " is duplicate character");
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {

        String text = "Java is a programming language";
//        printDuplicateCharacters(text);
        findDuplicateCharacters("programming");
    }
}
