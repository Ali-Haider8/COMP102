package L4.Examples;

/*
Source: 2- The String Data Type.pdf (page 1 of 3)
*/

public class StringMethods {

    public static void main(String[] args) {

        String text = "Hello World";
        String text2 = "java";

        int l = text.length();
        char ch = text.charAt(0);
        String sub = text.substring(0, 4);
        String con = text.concat(text2);
        String upper = text.toUpperCase();
        String lower = text.toLowerCase();
        int compare = text2.compareTo("java");
        boolean equal = text.equals("Java");
        boolean equalIgnore = text.equalsIgnoreCase("JAVA");
        boolean startWith = text.startsWith("Hello");
        boolean endWith = text.endsWith("World");
        String trim = " Java 101 ".trim();

    }
}
