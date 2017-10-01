//Write a Java program to check if a positive number is a palindrome or not

package beginnerProblems;

import java.util.Scanner;

public class NumberPalindrome {

	public static void main(String[] args) {

		java.util.Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a positive integer");
		int i = scanner.nextInt();
		scanner.close();
		
		System.out.println("IS the integer a palindrome?");
		if (pal(i) == true) {
			System.out.println("YES!");
		}
		else
			System.out.println("NO!");

	}

	public static boolean pal(int num) {
		String str = Integer.toString(num);
		int front = 0;
		int back = str.length() - 1;

		while (front < back) {
			if (str.charAt(front) != str.charAt(back)) {
				return false;
			} else {
				front++;
				back--;
			}
			return true;
		}
		return true;
	}

}
