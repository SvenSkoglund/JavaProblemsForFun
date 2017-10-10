package objectOrientedProblems;

public class Mybook extends Book {

	@Override
	void setTitle(String t) {
		this.title = t;
		System.out.println("The title is: " + t);
	}

}
