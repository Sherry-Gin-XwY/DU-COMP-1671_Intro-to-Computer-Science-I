/**
 * 
 * @author Weiye Xu
 * Programming Project 1
 * October 2, 2016
 * Calculates gallons of gas needed and number of stops for a road trip
 *
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class RoadTrip {
	
	public static void main(String[] args ) {
		
		Scanner sc = new Scanner (System.in);
		
		double distance;
		double mileGallonGets;
		double numberGallonsHolds;
		double require;
		double time;
		
		String capLeaving;
		String smallLeaving;
		String changeLeaving;
		
		String capDriving;
		String smallDriving;
		String changeDriving;
		
		System.out.print("Enter city you are leaving from: ");
		String cityLeaving = sc.nextLine();
		
		System.out.print("Enter city you are driving to: ");
		String cityDriving = sc.nextLine();
		
		capLeaving = cityLeaving.substring(0, 1);
		smallLeaving = cityLeaving.substring(1);
		changeLeaving = capLeaving.toUpperCase() + smallLeaving.toLowerCase();
		
		capDriving = cityDriving.substring(0, 1);
		smallDriving = cityDriving.substring(1);
		changeDriving = capDriving.toUpperCase() + smallDriving.toLowerCase();
		
		System.out.print("Enter distance in miles: ");
		distance = sc.nextDouble();
		
		System.out.print("Enter miles per gallon you car gets: ");
		mileGallonGets = sc.nextDouble();
		
		System.out.print("Enter the number of gallons your car's tank holds: ");
		numberGallonsHolds = sc.nextDouble();
		
		require = distance / mileGallonGets;
		time = require / numberGallonsHolds;
		
		DecimalFormat myformatte = new DecimalFormat("0.0");
		
		System.out.println("Your trip from " + changeLeaving + " to " + changeDriving + " will require " +  myformatte.format(require) + " gallons of gas.");
		System.out.println("Assume your gas tank is full when you leave, you will need to stop to fill up " + (int)time + " time.");
	}

}
