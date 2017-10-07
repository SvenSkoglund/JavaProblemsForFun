// Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.

package beginnerProblems;

import java.util.*;

public class Array123 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many ints in the array? ");
		int x = scanner.nextInt();
		int[] intArray = new int[x];
		for (int i = 0; i < intArray.length; i++) {
			System.out.println("Enter ineger number" + (i + 1));
			intArray[i] = scanner.nextInt();
		}
		array123(intArray);
	}

	public static boolean array123(int[] intArray) {
		for (int i = 0; i < intArray.length - 1; i++) {
			if (intArray[i]==1 && intArray[i+1]==2 && intArray[i+2]==3) {
				System.out.println(true);
				return true;
			}

		}
		System.out.println(false);
		return false;
	}
}
