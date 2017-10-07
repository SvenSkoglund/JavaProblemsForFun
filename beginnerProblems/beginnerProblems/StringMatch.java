// Given 2 strings, a and b, return the number of the positions where they contain the same length 2 substring. So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az" substrings appear in the same place in both strings.
package beginnerProblems;

import java.util.*;

public class StringMatch {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first string:  ");
		String x = scanner.nextLine();
		System.out.println("Enter the second string:  ");
		String y = scanner.nextLine();
		stringMatch(x,y);
	}

	public static int stringMatch(String x , String y) {
		int measure;
		int count = 0;
		if (y.length()>x.length()) {
			measure = x.length();
		}
		else 
			measure = y.length();
		for (int i = 0; i < measure - 1; i++) {
			if (x.charAt(i)==y.charAt(i) && x.charAt(i+1) == y.charAt(i+1)) {
				count = count + 1;
			}

		}
		System.out.println(count);
		return count;
	}
}
