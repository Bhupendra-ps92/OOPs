package static_part;

public class Program3 {
	static int i=12;

	public static void main(String[] args) {
		System.out.println(i);
		i=20;
		System.out.println(i);
		int i=40;
		System.out.println(i);//variable hiding in java
		i=52;
		System.out.println(i);
		System.out.println(Program3.i);//Access global variable
		Program3.i=76;//Updated global i
		System.out.println(i);//local i
		System.out.println(Program3.i);//global i

	}

}
