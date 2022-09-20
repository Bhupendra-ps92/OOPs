package PracticePrograms;

public class Rectangle {
	int width;
	int height;

	Rectangle(int w, int h) {
		width = w;
		height = h;
	}

	public void areaRectangle() {
		double area = width * height;
		double perimeter = 2 * (width + height);
		System.out.println("Area of Rectangle is: " + area);
		System.out.println("Perimeter of Rectangle is: " + perimeter);
	}

}
