package L3.HW;

/*
2- Write java program to create checkTraficlight(Light) , read the variable for
keyboard inside method.

Source: 4- H.W Methods using Java 2025.pdf (page 1 of 1)
*/

import java.util.Scanner;

public class CheckTraficLightMethod {

    static void checkTraficLight() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the color of the traffic light (red - yellow - green)");
        System.out.print("Color: ");
        String light = sc.nextLine();
        String action;
        switch (light) {
            case "red":
                action = "Stop";
                break;
            case "yellow":
                action = "Get Ready";
                break;
            case "green":
                action = "Go";
                break;
            default:
                action = null;

        }
        if (action != null)
            System.out.println("Action: " + action);
        else
            System.out.println("Invalid input");


    }

    public static void main(String[] args) {
        checkTraficLight();
    }
}
