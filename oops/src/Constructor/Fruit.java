package Constructor;

public class Fruit {
	String name;
	int price;
	double weight;

	Fruit() {
		System.out.println(this);

	}

	Fruit(String name) {
		this.name = name;
	}

	Fruit(String name, int price) {
		this(name);
		this.price = price;
	}

	Fruit(String name, int price, double weight) {
		this(name, price);
		this.weight = weight;
	}

	public void displayFruit() {
		System.out.println("Name is: " + name);
		System.out.println("Price is: " + price);
		System.out.println("Weight is: " + weight);
	}

}
