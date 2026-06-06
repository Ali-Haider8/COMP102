package Other;

/*
Source: exams-snapshots-batool.pdf (page 19 of 21)
*/

public class FindOutPutForLoop {

    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((i + 1) + " ");
            }
            System.out.println();
        }
    }
}
