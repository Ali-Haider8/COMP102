package L3;

public class MethodPassThreeDegreesFindAvg {

    static void avStudent(String st, int d1, int d2, int d3) {
        int sum = d1 + d2 + d3;
        double av = sum / 3;
        System.out.println(st + ": av=" + av);
    }

    public static void main(String[] args) {
        avStudent("Ali", 10, 10, 10);
        avStudent("Hussein", 20, 10, 20);
        avStudent("Mohammed", 50, 100, 50);
    }
}
