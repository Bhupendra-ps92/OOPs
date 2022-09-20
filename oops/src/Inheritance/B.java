package Inheritance;

public class B extends A {
	int i = 30;

	public void demo() {
		int i = 40;
		System.out.println("local i is: " + i);
		System.out.println("global i of same class is: " + this.i);
		System.out.println("global i of parent class is: " + super.i);
	}

}
