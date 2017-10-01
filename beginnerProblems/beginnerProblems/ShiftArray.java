//Write a Java program to create a new array that is left shifted from a given array of integers.

package beginnerProblems;

import java.util.Scanner;

public class ShiftArray {

	public static void main(String[] args) {
		
		// Asks for an integer
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a positive integer with at least 1 digit");
		int num = scanner.nextInt();
		scanner.close();
		
		//converts integer to array of chars
		char [] array = String.valueOf(num).toCharArray();
		
		//prints original array
		System.out.println(array);
		
		//prints shifted array
		System.out.println(shiftArray(array));
		
	}
	
	//This method takes a char array and shifts each character to the left, 
	//with the first value wrapping around to the last place
	public static char [] shiftArray (char [] array)
	{
		//Stores the first value
		char zero = array[0];
		
		//Assigns each index the value of the index after itself
		for (int i = 0 ; i < array.length -1 ; i++)
		{
			array[i]=array[i+1];
		}
		//Stores the saved first value into the last index
		array[array.length - 1] = zero;
		
		//Returns the new shifted array
		return array;
	}
}
