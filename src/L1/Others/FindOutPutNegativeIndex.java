package L1.Others;

/*
Source: exams-snapshots-batool.pdf (page 19 of 21)
*/

public class FindOutPutNegativeIndex {

    public static void main(String[] args) {
        int[] Array = {2, 5, 1, 9, -11};
        System.out.println(Array.length); // 5
        System.out.println(Array[-2]); // error: ArrayIndexOutOfBoundsException
    }
}
