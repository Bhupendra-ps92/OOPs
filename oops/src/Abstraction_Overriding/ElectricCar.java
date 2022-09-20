package Abstraction_Overriding;

public class ElectricCar extends Tesla {
	public void run()
	{
		System.out.println("Run the electric car");
	}
	public void stop()
	{
		System.out.println("Stop the electric car");
	}

	public void charge()
	{
		System.out.println("Charge the electric car");
	}

}
