package static_part;

public class part5 {
	static int i = 34;
	static int j;
	static {
		j = 86;
		System.out.println(i);
		System.out.println("This is static block-1");
		System.out.println(j);
	}

	public static void main(String[] args) {
		System.out.println("Main method");
		System.out.println(i);
		System.out.println(j);
	}

	static {
		i = 81;
		System.out.println("This is static block-2");
		System.out.println(i);
	}

}
