package static_part;

public class Program5 {
	static int i=test();
	static int j;

	public static void main(String[] args) {
		System.out.println("Main method");
		System.out.println(i+"  "+j);
	}
	public static int test()
	{
		System.out.println("test method");
		System.out.println(i+"  "+j);
		return 120;
	}

}
