// Given an int n, return true if it is within 10 of 100 or 200. 
// Note: Math.abs(num) computes the absolute value of a number.

package beginnerProblems;

import java.util.*;

public class nearHundred {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter an integer");
		int num = scanner.nextInt();
		scanner.close();

		System.out.println("Is the integer within 10 of 100 or 200?");
		System.out.println(nearHundred(num));
	}

	public static boolean nearHundred(int num) {
		return ((Math.abs(100-num) <= 10 || Math.abs(200-num) <= 10));
	}
}