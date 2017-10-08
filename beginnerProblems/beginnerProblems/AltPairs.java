//Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".



package beginnerProblems;

import java.util.*;

public class AltPairs {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a string: ");
		String str = scanner.nextLine();
		scanner.close();

		altPairs(str);
	}

	public static String altPairs(String str) {
		String newStr = "";
		for (int i = 0; i < str.length() - 1; i++) {
			if ((i+1)%3!=0) {
				newStr = newStr + str.charAt(i);
			}
			else
				i++;
			System.out.println(newStr);
		}
		System.out.println(newStr);

		return newStr;
	}
}
