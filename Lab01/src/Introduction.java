
/**
 * 
 * @author Weiye Xu
 * Lab 1
 * September 14, 2016
 *
 */

// Write a program which prints the following information to the screen:

//  Name: YourFirstName YourLastName
//  Birthplace: CityWhereYourWereBorn
//  Major: YourCollegeMajor
//  Number of First Year Students at DU: approximately 1425
//  Number of M&M candies produced each day: 400,000,000
//  Number of M&M candies per First Year Student: Result Of Calculation

import java.util.Scanner;

public class Introduction {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Please enter the follow information");
		
		System.out.print("Name: " );
		String name = sc.nextLine();
		
		System.out.print("Birthplace: ");
		String birthPlace = sc.nextLine();
		
		System.out.print("Major: ");
		String major = sc.nextLine();
		
		System.out.print("Number of First Year Students at DU: ");
		int numFirstYear = sc.nextInt();
		
		System.out.print("Number of M&M candies produced each day: ");
		int numCandies = sc.nextInt();
		
		System.out.println("\nThe final output: \n");
		
		System.out.println("Name: " + name);
		System.out.println("Birthplace: " + birthPlace);
		System.out.println("Major: " + major);
		System.out.println("Number of First Year Students at DU: " + numFirstYear);
		System.out.println("Number of M&M candies produced each day: " + numCandies);
		System.out.println("Number of M&M candies per First Year Student: " + (numCandies/numFirstYear));

	}

}
