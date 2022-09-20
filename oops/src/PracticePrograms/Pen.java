package PracticePrograms;

public class Pen {
	String name;
	int price;
	String color;
	Pen(String n,int p,String c)
	{
		name=n;
		price=p;
		color=c;
	}
	public void displayPen()
	{
		System.out.println("Name is: "+name);
		System.out.println("Price is: "+price);
		System.out.println("Color is: "+color);
	}

}
