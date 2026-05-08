package L3;

/*
Source: 3- Java Methods.pdf
*/

public class FindTriangleAndCircleArea {

    static float areaTrainagle(int base, int height) {
        float area = (base + height) / 2;
        return area;
    }

    static double areaCircle(double radius) {
        double areaCircle = 3.14 * (radius * radius);
        return areaCircle;
    }

    public static void main(String[] args) {

        float areaTriangle = areaTrainagle(5, 2);
        double areaCircle = areaCircle(4);
        System.out.println("Area of Triangle = " + areaTriangle);
        System.out.println("Area of Circle = " + areaCircle);


    }
}
