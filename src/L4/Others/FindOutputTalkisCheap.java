package L4.Others;

/*
Source: exams-snapshots-batool.pdf (page 19 of 21)
*/

public class FindOutputTalkisCheap {

    public static void main(String[] args) {
        String start = "Talk is cheap";
        String middle = "Show me the code";
        String end = " -Linus Torvalds";
        String result = start + middle + end;
        System.out.println(result);
        System.out.println(result.charAt(7));
    }
}
