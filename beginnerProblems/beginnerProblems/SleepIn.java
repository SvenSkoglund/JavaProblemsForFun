//The parameter weekday is true if it is a weekday, 
//and the parameter vacation is true if we are on vacation. 
//We sleep in if it is not a weekday or we're on vacation. 
//Return true if we sleep in.

package beginnerProblems;

import java.util.*;

public class SleepIn {
	public static void main(String[] args) throws InputMismatchException {
		Scanner scanner = new Scanner(System.in);

		try {
			System.out.println("Is it a weekday? Enter true or false: ");
			boolean weekday = scanner.nextBoolean();
			System.out.println("Are you on vacation? Enter true or false: ");
			boolean vacation = scanner.nextBoolean();
			scanner.close();
			sleepIn(weekday, vacation);

		}

		catch (InputMismatchException e) {
			System.out.println("Invalid Input");
			System.exit(0);
			;
		}

	}

	public static boolean sleepIn(boolean weekday, boolean vacation) {
		if (!weekday || vacation) {
			System.out.println("Sleep in!");
			return true;

		}
		System.out.println("Wake up early!");
		return false;
	}
}
