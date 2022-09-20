package Inheritance;

public class A {
	int i = 10;

	public void test() {
		int i = 20;
		System.out.println("local i is: " + i);
		System.out.println("locali is: " + this.i);
	}

}
