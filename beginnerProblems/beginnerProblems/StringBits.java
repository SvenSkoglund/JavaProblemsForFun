// Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".

package beginnerProblems;
import java.util.*;
public class StringBits {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter a string: ");
		String str = scanner.nextLine();
		scanner.close();
		
		stringBits(str);
		
	}
	
	public static String stringBits(String str) {
		String bits = "";
		int i = 0;
		for ( i = 0 ; i < str.length() ; i += 2) {
			bits = bits + str.charAt(i);
		}
		System.out.println(bits);
		return bits;
	}

}
