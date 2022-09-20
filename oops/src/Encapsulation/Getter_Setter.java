package Encapsulation;

import java.util.Scanner;

public class Getter_Setter {
	static int pswd = 12345;
	private String name;
	private int age;

	public String getName() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the password: ");
		int x = sc.nextInt();

		if (pswd == x) {
			return name;
		} else {
			System.out.println("Incorrect Password-plz re-enter");
			return null;
		}
	}

	public int getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
