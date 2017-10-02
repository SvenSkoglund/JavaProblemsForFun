//We have two monkeys, a and b, 
//and the parameters aSmile and bSmile 
//indicate if each is smiling.
//We are in trouble if they are both smiling 
//or if neither of them is smiling. 
//Return true if we are in trouble.

package beginnerProblems;

import java.util.*;

public class monkeyTrouble {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Monkey 1 is smiling. true or false");
		boolean one = s.nextBoolean();
		System.out.println("Monkey 2 is smiling. true or false");
		boolean two = s.nextBoolean();
		s.close();
		System.out.println("Are we in trouble?");
		System.out.println(monkeyTrouble(one, two));
	}

	public static boolean monkeyTrouble(boolean one, boolean two) {
		if ((one && two) || (!one && !two)) {
			return true;
		} else
			return false;

	}

}
