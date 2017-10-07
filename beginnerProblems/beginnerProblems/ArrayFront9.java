// Given an array of ints, return true if one of the first 4 elements in the array is a 9. The array length may be less than 4.

package beginnerProblems;

import java.util.*;

public class ArrayFront9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many ints in the array? ");
		int x = scanner.nextInt();
		int[] intArray = new int[x];
		for (int i = 0; i < intArray.length; i++) {
			System.out.println("Enter ineger number" + (i + 1));
			intArray[i] = scanner.nextInt();
		}
		ArrayFront9(intArray);
	}

	public static boolean ArrayFront9(int[] intArray) {
		for (int i = 0; /*i < 4 ||*/ i < intArray.length -1; i++) {
			if ( i == 4) {
				System.out.println(false);
				return false;
			}
			if (intArray[i] == 9) {
				System.out.println(true);
				return true;
			}

		}
		System.out.println(false);
		return false;
	}
}
