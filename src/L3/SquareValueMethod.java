package L3;

/*
Q5: Correct the following code
B)    class Main {
public static void square(int num) {
return num * num; }
public static void main(String[] args) {
int result;
square();
System.out.println("Squared value of 10 is: " + result); } }


Source: All-Questions-Second-Course.pdf (page 24 of 24)
*/

public class SquareValueMethod {

    public static int square(int num) {
        return num * num;
    }

    public static void main(String[] args) {
        int result = square(10);
        System.out.println("Squared value of 10 is: " + result);

    }
}
