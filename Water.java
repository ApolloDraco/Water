/* 
 *  Description: A Java Program that calculates the energy needed to heat water from an initial temperature to a final temperature
*/

import java.util.Scanner;

public class Water {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount of water in kilograms (kg): ");
      
        double kilograms = input.nextDouble();
        System.out.print("Enter the initial temperature in degrees Celsius (°C): ");
        double initialTemperature = input.nextDouble();
        System.out.print("Enter the final temperature in degrees Celsius (°C): ");
        double finalTemperature = input.nextDouble();
      
        final double SPECIFIC_HEAT_CAPACITY = 4184; // J/(kg·°C)
        double energy = kilograms * (finalTemperature - initialTemperature) * SPECIFIC_HEAT_CAPACITY;
      
        System.out.println("The energy needed is " + energy + " joules (J)");
    }
}
