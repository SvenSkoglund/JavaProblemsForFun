// Write a Java program to count the number of even and odd elements in a given array of integers.

package beginnerProblems;

import java.util.Scanner;

public class CountOddEven {

	public static void main(String[] args) {
		//Prompts for an integer
		java.util.Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a positive integer");
		float i = scanner.nextFloat();
		scanner.close();

		// Turns the integer into a char array
		char[] a = String.valueOf(i).toCharArray();
		
		// creates an in array through calling the oddEven Method
		int oddEvenTally [] = oddEven(a);
		
		//Prints the first index of the int array which tallys odd
		System.out.println("Number of Odds: " + oddEvenTally[0]);
		
		//Prints the second index of the int array which tallys even
		System.out.println("Number of Evens: " + oddEvenTally[1]);

	}
	
	// This method takes a char array and converts it to numerical
	// then tallys number off odd and even characters
	public static int [] oddEven ( char [] a )
	{
		// Initializes a new int array with two indexes
		// one for odd one for even. Begins them both at 0
		int [] oddEven = new int[2];
		oddEven[0]=0;
		oddEven[1]=0;
		
		// Loops through the length of the array argument passed to the method
		for (int i = 0 ; i < a.length - 1; i++)
		{
			// Checks for odd numbers at index [i] and adds one to odd tally if found
			if ( Character.getNumericValue(a[i]) % 2 == 1)
			{
				oddEven[0] = oddEven[0] + 1;
			}
			// Checks for even numbers at index [i] and adds one to even tally if found
			if ( Character.getNumericValue(a[i]) % 2 == 0)
			{
				oddEven[1] = oddEven[1] + 1;
			}
		}
		// returns the int array
		return oddEven;
	}
}
