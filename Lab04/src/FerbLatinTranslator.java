
/**
 * 
 * @author Weiye Xu
 * Lab 4
 * September 21, 2016
 *
 */

// Write a program that prompts the user for a first name and a last name, reads these into two
// String variables names first and last, and then translates the first and last name to Ferb Latin
// using the following rules:
//
//   If the length of the name is less than three letters, the name is not changed.
//   If the length of the name is three or more letters, move the first letter to the end and add
// "erb"

// Output the new name to the screen. The first letter of both the first and last name should be 
// capitalized. All other letters should be lowercase.

import java.util.Scanner;

public class FerbLatinTranslator {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter your first name: ");
		String firstName = sc.nextLine();
		
		System.out.print("Enter your last name: ");
		String lastName = sc.nextLine();
		
		String firstCap, firstChange, lastCap, lastChange;
		
		if (firstName.length() < 3)
		{
			firstCap = firstName.substring(0, 1);
			firstChange = firstName.substring(1);
			System.out.print("Your name in Ferb Latin is " + firstCap.toUpperCase() + firstChange.toLowerCase());
		}
		
		if (firstName.length() >= 3)
		{

			firstCap = firstName.substring(1,2);
			firstChange = firstName.substring(2) + firstName.substring(0, 1) + "erb";
		
			System.out.print("Your name in Ferb Latin is " + firstCap.toUpperCase());
			System.out.print(firstChange.toLowerCase());
		}
		
		if (lastName.length() < 3)
		{
			lastCap = lastName.substring(0, 1);
			lastChange = lastName.substring(1);
			System.out.print(" " + lastCap.toUpperCase() + lastChange.toLowerCase());
		}
		
		if (lastName.length() >=3)
		{
			lastCap = lastName.substring(1, 2);
			lastChange = lastName.substring(2) + lastName.substring(0, 1) + "erb";
			
			System.out.print(" " + lastCap.toUpperCase());
			System.out.print(lastChange.toLowerCase());
		}
	}
}
