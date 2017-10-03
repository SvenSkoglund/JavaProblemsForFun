// Given three int values, a b c, return the largest.

package beginnerProblems;
import java.util.*;
public class intMax {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first integer: ");
		int one = scanner.nextInt();
		System.out.println("Enter the second integer: ");
		int two = scanner.nextInt();
		System.out.println("Enter the third integer: ");
		int three = scanner.nextInt();
		scanner.close();
		
		System.out.println(intMax(one,two,three));
	}
	public static int intMax(int one, int two, int three) {
		if (one > two && one> three)
			return one;
		if (two>one && two>three)
			return two;
		if (three>two && three>one)
			return three;
		else
			return 0;
	}
}
