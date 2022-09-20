package static_part;

public class Part7 {
	static int i;
	static int j;
	static {
		System.out.println("Statis Block");
		i = test();
		System.out.println(i + "  " + j);
	}

	public static void main(String[] args) {
		System.out.println("Main method");
		System.out.println(i + "  " + j);
		int j = demo();
		System.out.println(i + "  " + j);
	}

	static int test() {
		System.out.println("This is test()");
		System.out.println(i + "  " + j);
		return 120;
	}

	static int demo() {
		i = 65;
		j = 23;
		System.out.println("This is demo()");
		System.out.println(i + "  " + j);
		return 20;
	}

}
