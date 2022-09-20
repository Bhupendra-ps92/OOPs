package PracticePrograms;

public class Dog {
	String Dogname;
	int Dogprice;
	String Dogcolor;
	Dog(String n,int p,String c)
	{
		Dogname=n;
		Dogprice=p;
		Dogcolor=c;
	}
	public void displayDog()
	{
		System.out.println("Name is: "+Dogname);
		System.out.println("Dog price is: "+Dogprice);
		System.out.println("Dog color is: "+Dogcolor);
	}

}
