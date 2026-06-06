package L2.Others;

/*
Q2: Write java program to create array books[][]={{"Java", "200$"}, {"C#", "300$"}, {"Python", "400$"}};
1- find book with price (200$)
2- print his name only after finding it.

Source: All-Questions-Second-Course.pdf (page 14 of 24)
*/

public class FindBookWith200DollarPrice {

    public static void main(String[] args) {
        String arr[][] = {
                {"Java", "200$"},
                {"C#", "300$"},
                {"Python", "400$"}
        };

        for (int i = 0; i < arr.length; i++)
            if (arr[i][1].equals("200$"))
                System.out.println(arr[i][0]);

    }
}
