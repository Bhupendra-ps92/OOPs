package PracticePrograms;

public class Circle {
	int radius;
	double pi = 3.14;

	Circle(int r) {
		radius = r;
	}

	public void areaCircle() {
		double area = pi * radius * radius;
		double perimeter = 2 * pi * radius;
		System.out.println("Area of circle is: " + area);
		System.out.println("Perimeter of circle is: " + perimeter);
	}

}
