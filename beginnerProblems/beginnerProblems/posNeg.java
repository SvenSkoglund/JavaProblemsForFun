//Given 2 int values, return true if one is negative and one is positive. Except if the parameter "negative" is true, then return true only if both are negative.

package beginnerProblems;

import java.util.*;

public class posNeg {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int one = scanner.nextInt();
		System.out.println("Enter a second integer: ");
		int two = scanner.nextInt();
		System.out.println("Enter a true or false: ");
		boolean tf = scanner.nextBoolean();
		scanner.close();
		
		
		System.out.println(posNeg(one, two, tf));

	}

	public static boolean posNeg(int one, int two, boolean tf) {

		if (tf) {
			return (one < 0 && two < 0);
		} else
			return ((one < 0 && two > 0) || (one > 0 && two < 0));
	}
}
