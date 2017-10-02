//Given 2 int values, return true if they are both in the range 30..40 inclusive, 
//or they are both in the range 40..50 inclusive.
package beginnerProblems;

import java.util.*;

public class Int3050 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first integer");
		int one = scanner.nextInt();
		System.out.println("Enter the second integer");
		int two = scanner.nextInt();

		System.out.println("Are the intigers both between 30 and 40 or both between 40 and 50?");

		boolean trueFalse = int3050(one, two);
		System.out.println(trueFalse);

	}

	public static boolean int3050(int one, int two) {
		if (one >= 30 && one <= 40 && two >= 30 && two <= 40) {
			return true;
		}
		if (one >= 40 && one <= 50 && two >= 40 && two <= 50) {
			return true;
		}
		return false;
	}
}
