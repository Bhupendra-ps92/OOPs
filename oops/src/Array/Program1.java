package Array;

public class Program1 {

	public static void main(String[] args) {
		double[] d = new double[5];
		// d[1]= 12.50;
		// d[3]=13.56;
		double d1[] = { 20.4, 23.21, 1.0, 2.0, 0.0 };
		double sum = 0;
		for (int i = 0; i < d.length; i++) 
		{
			sum = sum + d1[i];
		}
		System.out.println(sum);
	}

}
