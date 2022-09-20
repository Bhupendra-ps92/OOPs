package PracticePrograms;

public class Employee {
	String name;
	int salary;
	String designation;
	Employee(String n,int p,String c)
	{
		name=n;
		salary=p;
		designation=c;
	}
	public void displayEmployee()
	{
		System.out.println("Name is: "+name);
		System.out.println("Salary is: "+salary);
		System.out.println("Designation is: "+designation);
	}

}
