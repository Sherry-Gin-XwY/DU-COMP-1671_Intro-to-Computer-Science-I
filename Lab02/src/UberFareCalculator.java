
/**
 * 
 * @author Weiye Xu
 * Lab 2
 * September 16, 2016
 *
 */

import java.util.Scanner;

// Write a program that computes the cost and then outputs this information to the console
// window.  Store all three rates as constants and the minutes waited and miles driven as
// variables. Then compute the total cost.

public class UberFareCalculator {
	
	public static final int baseFare = 1;
	public static final double perMinuteWaited = 0.16;
	public static final double perMile = 1.10;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Please enter the following information: ");
		
		System.out.print("Minutes Waited: ");
		double minutesWaited = sc.nextInt();
		
		System.out.print("Miles Driven: ");
		double milesDriven = sc.nextInt();
		
		double costWithoutSurgePricing = baseFare + minutesWaited * perMinuteWaited + milesDriven * perMile;
		double costWithSurgePricing = costWithoutSurgePricing * 5;
		
		System.out.println("\nThe Final ouput would be: \n");
		
		System.out.println("Minutes Waited: " + minutesWaited);
		System.out.println("Miles Driven: " + milesDriven);
		System.out.println("Cost without surge pricing: $" + costWithoutSurgePricing);
		System.out.println("Cost with surge pricing: $" + costWithSurgePricing);
	}

}
