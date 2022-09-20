package static_part;

public class Part1 {
	static int i = 51;
	static int j;

	public static void main(String[] args) {
		System.out.println(i);
		System.out.println(j);
		i = 63;
		j = 34;
		System.out.println(i);
		System.out.println(j);
		test();
		System.out.println(i);
		int i = 88;
		System.out.println(j);
		System.out.println(i);
		System.out.println(Part1.i);
	}

	public static void test() {
		System.out.println(i);
		i = 90;
		System.out.println(i);
		j = 78;
		int i = 32;
		System.out.println(i);
		System.out.println(Part1.i);
	}

}
