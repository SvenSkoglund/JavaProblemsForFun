//We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 3 int values, return true if 1 or more of them are teen.package beginnerProblems;
package beginnerProblems;
import java.util.*;

public class hasTeen {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first integer");
		int one = scanner.nextInt();
		System.out.println("Enter the second integer");
		int two = scanner.nextInt();
		System.out.println("Enter the third integer");
		int three = scanner.nextInt();

		System.out.println("Is one the integers a teen?");

		boolean trueFalse = hasTeen(one, two, three);
		System.out.println(trueFalse);

	}

	public static boolean hasTeen(int one, int two , int three) {
		if (one >= 13 && one <= 19 || two >= 13 && two <= 19 || three >= 13 && three <= 19) {
			return true;
		}
		if (one >= 40 && one <= 50 && two >= 40 && two <= 50) {
			return true;
		}
		return false;
	}
}
