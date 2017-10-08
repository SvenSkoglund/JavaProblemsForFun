//Given a string, return a version where all the "x" have been removed. Except an "x" at the very start or end should not be removed.

package beginnerProblems;

import java.util.*;

public class StringX {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a string: ");
		String str = scanner.nextLine();
		scanner.close();

		stringX(str);
	}

	public static String stringX(String str) {
		String newStr = str.charAt(0) + "";
		for (int i = 1; i < str.length() - 1; i++) {
			if (str.charAt(i) != 'x' ) {
				newStr = newStr + str.charAt(i);
			}
			System.out.println(newStr);
		}
		newStr = newStr + str.charAt(str.length()-1);
		System.out.println(newStr);

		return newStr;
	}
}
