// Given a non-empty string like "Code" return a string like "CCoCodCode".



package beginnerProblems;

import java.util.Scanner;

public class StringSplosion {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter a string: ");
		String str = scanner.nextLine();
		scanner.close();
		
		stringSplosion(str);
	}
	
	public static String stringSplosion(String str) {
		String splosion = "";
		int j = 1;
		int i = 0;
		for ( i = 0 ; i < str.length() ; i++ ) {
			for ( int k = 0 ; k < j ; k++) {
				splosion = splosion + str.charAt(k);
			}
			j++;
			
		}
		System.out.println(splosion);
		return splosion;
	}

}
