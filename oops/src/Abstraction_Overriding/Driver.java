package Abstraction_Overriding;

public class Driver {

	public static void main(String[] args) {
		Car c = new ElectricCar();
		c.run();
		c.stop();
		c.charge();
		
		Tesla t=new ElectricCar();
		t.charge();

	}

}
