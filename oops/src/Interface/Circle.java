package Interface;

public class Circle implements Shape {
	public void area() {
		int r = 14;
		System.out.println("The area of circle is " + 3.14 * r * r);
	}

	public void perimeter() {
		int r = 21;
		System.out.println("Perimeter of circle is " + 2 * 3.14 * r);
	}

}
