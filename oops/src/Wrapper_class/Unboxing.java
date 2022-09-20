package Wrapper_class;

public class Unboxing {

	public static void main(String[] args) {
		Integer i = 10;
		int a = i;// converting non-primitive data to primitive
		System.out.println(a);
		System.out.println(i);

		System.out.println("-----------OR-----------");

		Integer j = new Integer(20);
		int b = j;
		System.out.println(b);
		System.out.println(j);

	}

}
