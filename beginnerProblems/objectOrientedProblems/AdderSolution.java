package objectOrientedProblems;

public class AdderSolution {

	public static void main(String[] args) {

		Adder newAdd = new Adder ();
		System.out.println("My superclass is: " + newAdd.getClass().getSuperclass().getName());
		System.out.println( newAdd.add(20, 22) + newAdd.add(13, 0)+newAdd.add(10, 10));
	}

}
