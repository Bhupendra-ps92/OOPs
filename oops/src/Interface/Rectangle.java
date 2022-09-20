package Interface;

public class Rectangle implements Shape {
	public void area() {
		int l = 24;
		int w = 18;
		System.out.println("The area of rectangle is " + (l + w));
	}

	public void perimeter() {
		int l = 16;
		int w = 18;
		System.out.println("Perimeter of rectangle is " + 2 * (l + w));
	}

}
