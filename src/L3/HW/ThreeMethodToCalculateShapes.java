package L3.HW;

/*
1- write java program to create three methods area of circle, circumference of a circle,
and area of area of the triangle, pass parameter not return value.

Source: 2- Java Methods.pdf (page 3 of 3)
*/
public class ThreeMethodToCalculateShapes {
    static double piValue = 3.14;

    static void circleArea(double radius) {
        double circle_area = (radius * radius) * piValue;
        System.out.println("Area of the circle = " + circle_area);
    }

    static void circleCircumference(double radius) {
        int circle_circumference = (int) (2 * (piValue * radius));
        System.out.println("Circumference of the circle = " + circle_circumference);
    }

    static void triangleArea(double base, double hieght) {
        double triangle_area = (base * hieght) / 2;
        System.out.println("Area of the triangle = " + triangle_area);
    }

    public static void main(String[] args) {
        circleArea(5);
        circleCircumference(5);
        triangleArea(5, 5);
    }
}
