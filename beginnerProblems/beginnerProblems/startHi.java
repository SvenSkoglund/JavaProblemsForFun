// Given a string, return true if the string starts with "hi" and false otherwise.

package beginnerProblems;

import java.util.*;

public class startHi {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a string");
		String string = scanner.nextLine();
		scanner.close();

		System.out.println("Does the string start with 'hi'");
		System.out.println(startHi(string));
	}

	public static boolean startHi(String string) {
		return (string.charAt(0) == 'h' || string.charAt(1) == 'i');
	}
}