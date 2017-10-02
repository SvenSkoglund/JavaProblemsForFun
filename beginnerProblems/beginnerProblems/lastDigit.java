// Given two non-negative int values, 
// return true if they have the same 
// last digit, such as with 27 and 57. 

package beginnerProblems;

import java.util.*;

public class lastDigit {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a positive integer: ");
		int one = scanner.nextInt();
		System.out.println("Enter a second positive integer: ");
		int two = scanner.nextInt();

		lastDigit(one, two);

	}

	public static boolean lastDigit(int one, int two) {
		if (one % 10 == two % 10) {
			System.out.println("The last digit is the same");
			return true;
		} else
			System.out.println("The last digits differ");
		return false;
	}

}
