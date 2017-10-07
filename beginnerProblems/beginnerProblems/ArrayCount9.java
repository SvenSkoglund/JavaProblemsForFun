// Given an array of ints, return the number of 9's in the array.


package beginnerProblems;
import java.util.*;
public class ArrayCount9 {

	public static void main(String[] args) {

		int [] intArray = intAsk();
		arrayCount9(intArray);
		
	
	}
	public static int arrayCount9 ( int intArray []) {
		int count = 0;
		for (int i = 0; i < intArray.length; i++) {
			if (intArray[i] == 9) {
				count = count + 1;
			}
		}
		System.out.println(count);
		return count;
	}
	public static int [] intAsk () {
	Scanner scanner = new Scanner(System.in);
	int [] intArray = new int [5];
	System.out.println("Enter the first integer");
	intArray[0] = scanner.nextInt();
	System.out.println("Enter the second integer");
	intArray[1] = scanner.nextInt();
	System.out.println("Enter the third integer");
	intArray[2] = scanner.nextInt();
	System.out.println("Enter the fourth integer");
	intArray[3] = scanner.nextInt();
	System.out.println("Enter the fifth integer");
	intArray[4] = scanner.nextInt();
	scanner.close();
	
	return intArray;
	}

}
