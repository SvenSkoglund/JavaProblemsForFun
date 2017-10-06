// Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".
package beginnerProblems;

public class CountXX {

	public static void main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = scanner.nextLine();
		scanner.close();

		countXX(str);
	}

	public static int countXX(String str) {
		int i = 0;
		int count = 0;
		while (i < str.length() - 1) {
			if (str.charAt(i) == 'x' && str.charAt(i + 1) == 'x') {
				count = count + 1;
			}
			i++;
		}
		System.out.println(count);
		return count;
	}
}
