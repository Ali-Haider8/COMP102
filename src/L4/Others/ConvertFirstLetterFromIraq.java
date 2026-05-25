package L4.Others;

/*
ex2: read string s1=“i am from iraq” then
convert first letter from Iraq to capital later

Source: 1- JavaString2025.pdf (page 19 of 19)
*/

public class ConvertFirstLetterFromIraq {

    public static void main(String[] args) {
        String s1 = "i am from iraq";
        String[] words = s1.split("\\s");
        for (int i = 0; i < words.length; i++) {
            if (words[i].equalsIgnoreCase("iraq")) {
                words[i] = words[i].substring(0, 1).toUpperCase() + words[i].substring(1);
            }
        }
        for (String w : words) System.out.print(w + " ");
    }
}
