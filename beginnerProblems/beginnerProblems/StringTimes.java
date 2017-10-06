//  Given a string and a non-negative int n, return a larger string that is n copies of the original string.



package beginnerProblems;

public class StringTimes {

	public static void main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = scanner.nextLine();
		System.out.println("Enter a positive integer: ");
		int num = scanner.nextInt();
		scanner.close();
		
		stringTimes ( str , num);
	}

	public static void stringTimes(String str , int num) {
		String s = "";
		int num2 = num;
		int i = 1;
		
		while ( i <= num2) {
			s = s + str;
			i++;
		}
		System.out.println(s);
	}
}
