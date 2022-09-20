package Interface;

public class ShapeDriver {

	public static void main(String[] args) {
		Shape s1 = new Rectangle();
		s1.area();
		s1.perimeter();
		System.out.println("=========================");
		
		Shape s2 = new Circle();
		s2.area();
		s2.perimeter();
	}
	
}
