package L4.Examples;

/*
Source: 1- JavaString2025.pdf (page 11 of 19)
*/

public class IsEmptyMethod {

    public static void main(String[] args) {
        String s1 = "java string split method by javatpoint";
        String[] words = s1.split("\\s"); // splits the string based on whitespace
        //using java foreach loop to print elements of string array
        for (String w : words) System.out.println(w);

    }
}
