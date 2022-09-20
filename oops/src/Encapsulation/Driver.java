package Encapsulation;

public class Driver {

	public static void main(String[] args) {
		Getter_Setter gs=new Getter_Setter();
		gs.setName("Bhupendra");
		System.out.println(gs.getName());
		gs.setAge(30);
		System.out.println(gs.getAge());
		
		System.out.println("---------------");
		System.out.println(gs.getClass());
		System.out.println(gs.toString());
		System.out.println(gs.hashCode());
		gs=null;
		System.gc();//finalize method call
		

	}

}
