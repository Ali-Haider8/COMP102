package L4.Examples;

/*
Source: 1- JavaString2025.pdf (page 17 of 19)
*/

public class TrimFunction {

    public static void main(String[] args) {
        String s1 = " hello java string ";
        System.out.println(s1.length());
        System.out.println(s1); // Without trim()
        String tr = s1.trim();
        System.out.println(tr.length());
        System.out.println(tr);
    }
}
