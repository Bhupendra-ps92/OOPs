package PracticePrograms;

public class Tv {
	String name;
	int price;
	String brand;
	Tv(String n,int p,String c)
	{
		name=n;
		price=p;
		brand=c;
	}
	public void displayTv()
	{
		System.out.println("Name is: "+name);
		System.out.println("Price is: "+price);
		System.out.println("Brand name is: "+brand);
	}

}
