package static_part;

public class Program4 {
	static int i = 12;
	static int j;

	public static void test() {
		System.out.println("This is main method " + i + "  " + j);
		i = 45;
		int j = 56;
		System.out.println("This is main method " + i + "  " + j);
	}

	public static void demo() {
		System.out.println("This is main method " + i + "  " + j);
		i = 123;
		int j = 456;
		System.out.println("This is main method " + i + "  " + j);
	}

	public static void main(String[] args) {
		System.out.println("This is main method " + i + "  " + j);
		test();
		demo();
		System.out.println("This is main method " + i + "  " + j);
	}
}