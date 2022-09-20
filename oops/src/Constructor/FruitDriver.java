package Constructor;

public class FruitDriver {

	public static void main(String[] args) {
		Fruit f1 = new Fruit();
		f1.displayFruit();
		System.out.println("---------------");

		Fruit f2 = new Fruit("Mango");
		f2.displayFruit();
		System.out.println("---------------");

		Fruit f3 = new Fruit("Mango", 120);
		f3.displayFruit();
		System.out.println("---------------");

		Fruit f4 = new Fruit("Mango", 120, 2.3);
		f4.displayFruit();
		System.out.println("---------------");
	}
}
