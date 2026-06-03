package L4.Others;

/*
Source:  (page 1 of 1)
*/

public class ReverseAString {

    public static void main(String[] args) {

        String text = "A B C";
        char[] ch = text.toCharArray();
        System.out.println(ch.length-1);
        for (int i = ch.length-1; i >= 0; i--)
            System.out.print(ch[i]);

    }
}
