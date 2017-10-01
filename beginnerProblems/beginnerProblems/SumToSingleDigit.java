//Write a Java program to add all the digits of a given positive integer until the 
//result has a single digit.

package beginnerProblems;

import java.util.*;

public class SumToSingleDigit {

	public static void main(String[] args) {

		java.util.Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a positive integer");
		float i = scanner.nextFloat();
		scanner.close();

		// Turns the integer into a char array
		char[] a = String.valueOf(i).toCharArray();
		while (true) {
			// Sums the char array into a new char array, if the length is still larger
			// than 1 this code runs
			if (sumToOne(a).length > 1) {
				a = sumToOne(a);
			}
			// Once the returned char array is length 1 this code runs
			else {
				a = sumToOne(a);
				System.out.println(a);
				break;
			}
		}

	}

	// This sums all the chars in the array and returns a new char array
	public static char[] sumToOne(char[] a) {
		int sum = 0;
		for (int j = 0; j < a.length; j++) {
			sum = sum + Character.getNumericValue(a[j]);
			// System.out.println(sum);

		}

		return String.valueOf(sum).toCharArray();

	}

}
