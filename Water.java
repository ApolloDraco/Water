/* 
 *  Description: A Java Program that calculates the energy needed to heat water from an initial temperature to a final temperature
*/

import java.util.Scanner;
public class Water
{
   public static void main(String[] args)
{
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the amount of water in kilograms: ");
      
      double kilograms = input.nextDouble();
      System.out.print("Enter the initial temperature: ");
      double initialTemperature = input.nextDouble();
      System.out.print("Enter the final temperature: ");
      double finalTemperature = input.nextDouble();
      
      double energy = kilograms * (finalTemperature - initialTemperature) * 4184;
      
      System.out.println("The energy needed is " + energy);
   }
}
