package Wrapper_class;

public class Boxing {

	public static void main(String[] args) {
		int a = 10;

		Integer i = new Integer(a);//converting primitive to non-primitive data
		System.out.println(a);
		System.out.println(i);
		System.out.println("-----------------------");

		int b = 20;
		Integer j = b;//automatically converting
		System.out.println(b);
		System.out.println(j);

	}

}
