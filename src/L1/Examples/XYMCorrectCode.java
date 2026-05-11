package L1.Examples;

/*
Q4:- Correct the following of code :

Int m;
Int x[ ] = int [10];
Int [ ] y = int [11];
For (m=1; m<=10; ++m)
X[m] = y[m] = m;

x = y = new int [20];
for (m=1; m<=10; ++m)
System.out.Println (x);


Source: All-Questions-Second-Course.pdf (page 10 of 24)
*/

public class XYMCorrectCode {

    public static void main(String[] args) {
        int m;
        int[] x = new int[10];
        int[] y = new int[10];
        for (m = 0; m < 10; ++m) {
            x[m] = y[m] = m;
        }
        x = y = new int[20];
        for (m = 0; m < 20; ++m) {
            System.out.println((m + 1) + " -> " + x[m]);
        }
    }
}
