package objectOrientedProblems;

public class Bird extends Animal{
	public Bird() {
		fly();
		sing();
	}
	public void fly() {
		System.out.println("I am flying!");
	}
	public void sing() {
		System.out.println("I am singing!");
	}
}
