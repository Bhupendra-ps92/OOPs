package PracticePrograms;

public class Watch {
	String Wname;
	int Wprice;
	String Wcolor;
	Watch(String n,int p,String c)
	{
		Wname=n;
		Wprice=p;
		Wcolor=c;
	}
	public void displayWatch()
	{
		System.out.println("Watch name is: "+Wname);
		System.out.println("Watch price is: "+Wprice);
		System.out.println("Watch color is: "+Wcolor);
	}

}
