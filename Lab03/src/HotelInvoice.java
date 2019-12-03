
/**
 * 
 * @author Weiye Xu
 * Lab 3
 * September 21, 2016
 *
 */

// Write Java program which will generate an invoice for his stay at the Inn. Your program should 
// ask for user for the following information:
//
//  - the number of nights Sam stayed at the inn
//  - cost per night of staying at the inn
//  - the tax rate for the taxes collected by the Shire (as a percent)
//  - the tax rate for the taxes collected by the City of Bree (as a percent)
//
// The program should then print out an Invoice 

import java.text.DecimalFormat;
import java.util.Scanner;

public class HotelInvoice {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("The numbe of nights Sam stayed at the inn: ");
		int numberOfNight = sc.nextInt();
		
		System.out.print("Cost per night of Staying at the inn: ");
		double costPerNight = sc.nextDouble();
		
		System.out.print("The tax rate for the taxes collected by the Shire (as a percent): ");
		double taxRate_Shire = sc.nextDouble();
		
		System.out.print("The tax rate for the taxes collected by the City of Bree (as a percent): ");
		double taxRate_cityOfBee = sc.nextDouble();
		
		DecimalFormat myformatte = new DecimalFormat("0.00");
		
		System.out.println("\nThe final output would be\n");
		
		System.out.println("\nThe Prancing Pony Inn, City of Bree, Shire\n");
		System.out.println("Invoice for Samwise Gamgee");
		System.out.println("Cost Per night: $" + myformatte.format(costPerNight));
		
		double taxes_Shire = costPerNight * taxRate_Shire/100;
		System.out.println("Shire taxes per night at rate of " + taxRate_Shire +  ": $" + myformatte.format(taxes_Shire));
		
		double taxes_CityOfBee = costPerNight * taxRate_cityOfBee/100;
		System.out.println("Bress taxes per night at rate of " + taxRate_cityOfBee +  ": $" + myformatte.format(taxes_CityOfBee));
		
		double totalCostPerNight = costPerNight + taxes_Shire + taxes_CityOfBee;
		System.out.println("Total cost per night: $" + myformatte.format(totalCostPerNight));
		
		double totalCost = numberOfNight * totalCostPerNight;
		System.out.println("Total cost: $" + myformatte.format(totalCost));
		
	}

}
