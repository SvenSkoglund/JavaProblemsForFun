// Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars,
// or whatever is there if the string is less than length 3. Return n copies of the front;

package beginnerProblems;

public class FrontTimes {

	public static void main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = scanner.nextLine();
		System.out.println("Enter a positive integer: ");
		int num = scanner.nextInt();
		scanner.close();

		stringTimes(str, num);
	}

	public static void stringTimes(String str, int num) {
		char[] s = { str.charAt(0), str.charAt(1), str.charAt(2) };
		int i = 0;

		while (i < num) {
			for (int j = 0; j < s.length; j++) {
				System.out.print(s[j]);
			}
			i++;
		}
		return;
	}
}
