/**
 * 
 * @author Weiye Xu
 * Lab 05
 * September, 28, 2016
 *
 */

// Write a program that reads a one-line sentence as input and then displays the following response:

//   If the sentence ends with a questions mark (?) and the input contains an even number of characters, display the word Yes.
//   If the sentence ends with a question mark and the input contains an odd number of characters, display the word No.
//   If the sentence ends with an exclamation point (!), display the word Wow.
//   In all other cases, display the words You always say followed by the input string enclosed in quotes.

import java.util.Scanner;

public class ReplyGenerator {
	
	public static void main(String[] args) {
		
		System.out.print("Enter your sentence: ");
		Scanner sc = new Scanner (System.in);
		String sentence = sc.nextLine();
		
		if ((sentence.charAt(sentence.length() - 1) == '?') && (sentence.length() %2 == 1))
		{
			System.out.println("No");
		}
		else if ((sentence.charAt(sentence.length() - 1) == '?') && (sentence.length()%2 == 0))
		{
			System.out.println("Yes");
		}
		else if (sentence.charAt(sentence.length() - 1) =='!')
		{
			System.out.println("Wow");
		}
		else
		{
			System.out.println("You always say \"" + sentence + "\"");
		}
	}

}
