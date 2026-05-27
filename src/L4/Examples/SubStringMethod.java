package L4.Examples;

/*
Source: 1- JavaString2025.pdf (page 9 of 19)
*/

public class SubStringMethod {

    public static void main(String[] args) {
        String s1 = "javatpoint";
        System.out.println(s1.substring(0, 4)); // return java
        // end index: 4 = t is not printed
        System.out.println(s1.substring(5)); // return point
    }
}
