package L3.HW;

/*
2- Write java program to create checkTraficlight(Light) , read the variable for
keyboard inside method.

Source: 4- H.W Methods using Java 2025.pdf (page 1 of 1)
*/

import java.util.Scanner;

public class CheckTraficLightMethod {

    static void checkTraficLight(String color) {
        String action = "";
        if (color.equals("red")) action = "Stop";
        else if (color.equals("yellow")) action = "Get Ready";
        else if (color.equals("green")) action = "Go";
        else System.out.println("Invalid Input");
        System.out.println("Action: " + action);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the color of the traffic light");
        System.out.println("red - " + "yellow - " + "green");
        System.out.print("Current color is: ");
        String color = sc.nextLine();
        checkTraficLight(color);
    }
}
