package L3;

/*
Q5: Correct the following code

A) Public int [] secondarydia (int x [][]){
    for (int i = 0; i <= 3; i++)
    {
        for (int j = 0; j < 4; ++j)
        {
            if (i = j)
                System.out.println(x[i][j]);
            if ((j - i) == 2)
                System.out.println(x[i][j] + ",");
        }
    }
}

Public static void main(String args[]){
    int x[][] = new int [][] {
        {1, 2, 3, 4},
        {5, 6, 7, 8},
        {9, 10, 11, 12}
    };
    secondarydia();
}


Source: All-Questions-Second-Course.pdf (page 24 of 24)
*/

public class SecondaryDiaMethod {

    static void secondarydia(int[][] arr) {
        int n = arr.length;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if ((i + j) == (n - 1)) {
                    System.out.println(arr[i][j]);
                }
            }
        }

    }

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        secondarydia(arr);
    }
}
