/**
 * 
 * @author Weiye Xu
 * Lab 11
 * October, 21, 2016
 *
 */

import java.time.Clock;

public class Fraction {
	
	// Your Fraction class should have two private integer instance variables, numerator and denominator. 
	// Initially, the value of numerator should be 0 and the value of denominator should be 1.
	
	private int numerator = 0;
	private int denominator = 1;
	
	// Write two mutator methods, setNumerator and setDenominator, 
	// that allow the user to set the numerator and the denominator to an integer value. 
	
	public void setNumerator(int setNumerator)
	{
		this.numerator = setNumerator;
	}
	
	// Your code should not allow the denominator to be set to 0. 
	// If the user tries to set the denominator to 0, the value should not be changed.
	
	public void setDenominator(int setDenominator)
	{
		if(setDenominator == 0)
		{
			// do nothing;
		}
		else
		{
			this.denominator = setDenominator;
		}
	}
	
	// Also, include a method named getValue that returns the value of the numerator 
	// divided by the denominator as a double.
	
	public double getValue()
	{
		return (double) numerator/denominator;
		
	}
	
	// Add a toString method that returns a String representation of the 
	// fraction in the form numerator/denominator, for example 5/3.
	public String toString()
	{
		return numerator + "/" + denominator;
	}
	
	// Finally, add an equals method that determines whether two objects of type Fraction are equal. 
	// Note that 3/5 and 6/10 should be considered equal.
	
	public boolean equals(Fraction otherFraction)
	{
		return getValue() == otherFraction.getValue();
		// return numerator * otherFraction.denominator == denominator * otherFraction.numerator;
	}
	
}
