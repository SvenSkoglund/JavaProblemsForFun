//Given a string, take the first 2 chars and return 
//the string with the 2 chars added at both the front 
//and back, so "kitten" yields"kikittenki". 
//If the string length is less than 2, use whatever chars are there.



package beginnerProblems;

import java.util.*;

public class String22 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string");
		String string = scanner.nextLine();
		scanner.close();
		System.out.println(string22(string));
	}

	public static String string22(String string) {
		if (string.length() < 2) {
			String newString = string + string + string;
			return newString;
		} else {
			String newString = "" + string.charAt(0) + string.charAt(1) + string + string.charAt(0) + string.charAt(1);
			return newString;
		}
	}
}
