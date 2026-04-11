package L1;

import java.util.Scanner;
//  Example 2: Write a Java program to store a week temperature and print the highest
//temperature.
public class HighestTemperature {

    static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        double[] temperatures;
        temperatures = new double[4];

        for (int i = 0; i < temperatures.length; i++) {
            System.out.print("Enter max temperature for day" + (i + 1) + ": ");
            temperatures[i] = keyboard.nextDouble();
        }
        keyboard.close();

        double highest = temperatures[0];
        int dayIndex = 0;
        for (int i = 1; i < temperatures.length; i++) {
            if (temperatures[i] > highest) {
                highest = temperatures[i];
                dayIndex = i;
            }
        }

        System.out.println("The highest temperature from day 1" + " to day " + temperatures.length + " is: " + highest + " on " + (dayIndex + 1) + " day");

    }
}
