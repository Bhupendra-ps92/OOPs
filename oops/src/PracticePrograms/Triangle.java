package PracticePrograms;

public class Triangle {
	int base;
	int height;
	Triangle(int b,int h)
	{
		base=b;
		height=h;
	}
	public void findArea()
	{
		double area=0.5*base*height;
		System.out.println("Area is: "+area);
			
	}

}
