package L1;

import java.util.Scanner;

public class TemperatureReadings {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        double[] temperature; // Create the array
        temperature = new double[4]; // Allocate 7 elements

        System.out.print("Enter (4) temperatures: ");
        // Enter temperatures (elements) from user
        for (int i = 0; i < temperature.length; i++) {
            temperature[i] = keyboard.nextDouble();
        }
        keyboard.close();

        // Display temperatures (elements)
        System.out.println();
        System.out.println("***TEMPERATURES ENTERED***");
        System.out.println();
        for (int i = 0; i < temperature.length; i++)
            System.out.println("Day " + (i + 1) + ": " + temperature[i]+"°C");
    }
}
