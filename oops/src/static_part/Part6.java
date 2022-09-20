package static_part;

public class Part6 {
	static int i=20;
	static int j;
	static int k;
	static {
		j=45;
		k=test();
	}

	public static void main(String[] args) {
		System.out.println("Main method");
		System.out.println(i+"  "+j+"  "+k);
	}
	public static int test()
	{
		System.out.println("test method");
		return 100;
	}

}
