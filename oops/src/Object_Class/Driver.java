package Object_Class;

public class Driver {

	public static void main(String[] args) {
		Employ e = new Employ();
		Mobile m = new Mobile();

		System.out.println(e.getClass());
		System.out.println(e.toString());
		System.out.println(e.hashCode());
		e = null;
		System.gc();// finalize method call

		System.out.println("===============");
		System.out.println(m.getClass());
		System.out.println(m.toString());
		System.out.println(m.hashCode());
		m = null;
		System.gc();// finalize method call

	}

}
