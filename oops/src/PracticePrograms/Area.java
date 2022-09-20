package PracticePrograms;

public class Area {

	public static void main(String[] args) {
		Circle c = new Circle(5);
		c.areaCircle();
		System.out.println("--------------------------");
		Rectangle r = new Rectangle(12, 18);
		r.areaRectangle();
		System.out.println("--------------------------");
		Cuboid c1=new Cuboid(4,5,6);
		c1.areaCuboid();

	}

}
