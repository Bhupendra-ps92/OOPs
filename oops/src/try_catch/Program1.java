package try_catch;

public class Program1 {

	public static void main(String[] args) {
		/*
		String s="java";
		s=null;
		System.out.println(s.length());
		
		System.out.println("ending");
		*/
		System.out.println("starting");
		try
		{
			System.out.println(Class.forName("java.util.scanner"));
		}
		catch(Exception e)
		{
			System.out.println("we are handling the exception");
		}
		System.out.println("ending");

	}

}
