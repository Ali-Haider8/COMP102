package L4.Examples;

/*
Source: 1- JavaString2025.pdf (page 11 of 19)
*/

public class EqualsMethod {

    public static void main(String[] args) {
        String s1 = "javatpoint";
        String s2 = "javatpoint";
        String s3 = "JAVATPOINT";
        String s4 = "python";
        System.out.println(s1.equals(s1)); // true because content and case is same
        System.out.println(s1.equals(s3)); // false because case in not same
        System.out.println(s1.equals(s4)); // false because content is not same
        System.out.println(s1.equalsIgnoreCase(s3)); // true because use IgnoreCase
    }
}
