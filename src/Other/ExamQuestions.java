package Other;


public class ExamQuestions {

    public static void main(String[] args) {
//        Interviewbit(); // print 10 times
//        add(2,3);
//        System.out.println(add(2.5, 3.5));
//        arrXAndY(); // print 20 times
    }

    /*
4- Given this code, what is the output?
public class Test {
    static int add(int a, int b) {
        return a + b;
    }
    static double add(double a, double b) {
        return a + b;
    }
    public static void main(String[] args) {
        System.out.println(add(2, 3));
    }
}
A) 5   B) 5.0   C) Compilation error   D) 5

Source: final-exams-csklawat.pdf (page 1 of 11)
*/
    static int add(int a, int b) {

        return a + b;
    }

    static double add(double a, double b) {
        return a + b;
    }

    static void Interviewbit() {
/*
11- How many times will "Interviewbit" be printed.
    Int count = 0;
    do{
        System.out.println("Interviewbit");
        count++;
    } while(count < 10);

    a- 9      b- 11      c- 10

Source: final-exams-csklawat.pdf (page 8 of 11)
*/
        int count = 0;
        do {
            System.out.println("Interviewbit");
            count++;
        } while (count < 10);
    }

    static void arrXAndY() {
/*
Q4:- Correct the following of code.
Int m ;

Int x[ ] = int [10];

Int [ . ] y = int [11] ;

For(m = 1; m <= 10; ++m)
    X[m] = y[m] = m;

x = y = new int[20];

for (m = 1; m <= 10; ++m)
    System.out.Println(x);

Soruce: All-Questions-Second-Course.pdf (page 5 of 24)
*/
        int m;
        int x[] = new int[10];
        int[] y = new int[10];

        for (m = 0; m < 10; ++m)
            x[m] = y[m] = m;
        x = y = new int[20];

        for (m = 0; m < 20; ++m)
            System.out.print(m + ", " + x[m] + " ");
    }
}
