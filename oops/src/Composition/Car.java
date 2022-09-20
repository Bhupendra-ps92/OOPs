package Composition;

public class Car {
	String name;
	int price;
	Engine e;

	Car() {

	}

	Car(String name, int price) {
		this.name = name;
		this.price = price;
	}

	Car(String name, int price, Engine e) {
		this.name = name;
		this.price = price;
		this.e = e;
	}

}
