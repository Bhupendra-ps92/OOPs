package PracticePrograms;

public class Driver {

	public static void main(String[] args) {
		Pen p1=new Pen("Pilot",50,"Black");
		p1.displayPen();
		System.out.println("==========================");
		
		Employee e1=new Employee("Jack",70000,"Software Developer");
		e1.displayEmployee();
		System.out.println("==========================");
		
		Tv t1=new Tv("Bravia",45000,"Sony");
		t1.displayTv();
		System.out.println("==========================");
		
		Browser b1=new Browser("Chrome");
		b1.displayBrowser();
		System.out.println("==========================");
		
		Dog d1=new Dog("Lebra",16000,"White");
		d1.displayDog();
		System.out.println("==========================");
		
		Watch w1=new Watch("Fastrack",2000,"Green");
		w1.displayWatch();
		System.out.println("==========================");
		
		Triangle t2=new Triangle(12,36);
		t2.findArea();

	}

}
