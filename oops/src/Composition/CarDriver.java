package Composition;

public class CarDriver {

	public static void main(String[] args) {
		Engine e = new Engine(80, 90, 69);
		Car c1 = new Car("Audi", 785634, e);

		System.out.println(c1);
		System.out.println(c1.e);
		System.out.println(c1.name);
		System.out.println(c1.price);
		System.out.println(c1.e.hp);
		System.out.println(c1.e.strokes);
		System.out.println(c1.e.speed);

	}

}
