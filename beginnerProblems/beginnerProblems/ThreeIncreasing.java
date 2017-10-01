//Write a Java program to check if an array of integers contains three increasing adjacent numbers

package beginnerProblems;
import java.util.*;
public class ThreeIncreasing {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a positive integer");
		float num = scanner.nextFloat();
		char [] array = String.valueOf(num).toCharArray();
		
		System.out.println("Contains 3 consecutive increasing numbers? " + checkFor3(array));
		
		
		
		
	}
	public static boolean checkFor3 (char [] array) {
		for ( int i = 0 ; i < array.length - 2 ; i++) {
			if (array[i] < array[i+1] && array [i+1] < array[i+2]) {
				//System.out.println("Contains three consecutive increasing numbers!");
				return true;
			}
		}
		return false;
		
		
	}

}
