//Given a string, return a string made of the first 2 chars (if present), 
//however include first char only if it is 'o' and include the second only 
//if it is 'z', so "ozymandias" yields "oz".


package beginnerProblems;

import java.util.*;

public class startOz {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a string");
		String string = scanner.nextLine();
		scanner.close();

		System.out.println("ozymandias?");
		System.out.println(startOz(string));
	}

	public static String startOz(String string) {
		if (string.charAt(0)=='o' && string.charAt(1)=='z') {
			string = "oz";
			return string;
	}
		if (string.charAt(0)=='o') {
			string = "o";
			return string;
		}
		if (string.charAt(1) == 'z') {
			string = "z";
			return string;
		}
		string = "";
		return string;
	}
}