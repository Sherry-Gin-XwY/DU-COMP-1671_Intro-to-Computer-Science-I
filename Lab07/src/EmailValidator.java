/**
 * 
 * @author Weiye Xu
 * Lab 07
 * October£¬ 5£¬ 2016
 *
 */

import java.util.Scanner;

public class EmailValidator {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// Part 1
		
		/*
		System.out.print("Enter a valid DU email address: ");
		String emailAddress = sc.nextLine();
		
		while (!emailAddress.endsWith("@du.edu"))
		{
			System.out.println("Enter a valid DU email address: " + emailAddress);
			System.out.print("Enter your email address: ");
			emailAddress = sc.nextLine();
		}
		
		System.out.print("You corresctly entered: " + emailAddress);
		*/
		
		// Part 2
		
		String emailAddress;
		int count = 0;
		
		do
		{
			count ++;
			System.out.print("Enter a valid DU email address: ");
			emailAddress = sc.nextLine();
		}
		
		while ((!emailAddress.endsWith("@du.edu")) && (count < 10));
		
		if (emailAddress.endsWith("@du.edu"))
		{
			System.out.println("You correctly entered: " + emailAddress);
		}
		else if ((!emailAddress.endsWith("@du.edu")) && (count >= 10))
		{
			System.out.println("Did you forgot your email address?");
		}
	}
}
