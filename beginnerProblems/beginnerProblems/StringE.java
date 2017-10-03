// Return true if the given string contains between 1 and 3 'e' chars.

package beginnerProblems;

import java.util.*;

public class StringE {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a string");
		String string = scanner.nextLine();
		scanner.close();

		System.out.println("Does the string contain 1, 2, or 3 'e's?");
		System.out.println(threeE(string));
	}

	public static boolean threeE(String string) {
		int sumE = 0;
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) == 'e') {
				sumE = sumE + 1;
			}
		}
		return (sumE == 1 || sumE == 2 || sumE == 3);
	}

}
