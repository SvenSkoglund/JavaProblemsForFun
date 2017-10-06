// Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".
package beginnerProblems;

public class DoubleX {

	public static void main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = scanner.nextLine();
		scanner.close();
		
		System.out.println(doubleX ( str));
	}

	public static boolean doubleX(String str) {
		int i = 0;
		
		while ( i < str.length()) {
			if (str.charAt(i) == 'x' && str.charAt(i+1) == 'x') {
				return true;
			}
			if (str.charAt(i) == 'x' && str.charAt(i+1) != 'x') {
				return false;
			}
			i++;
		}
		return false;
	}
}
