package Upcasting_Downcasting_Overriding;

import java.util.Scanner;

public class Game {
	static String gameName = "BGMI";

	Weapon pressButton() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter  the score: ");
		int score = sc.nextInt();
		if (score <= 400) {
			System.out.println("You got the knife");
			Knife k = new Knife();
			return k;
		} else if (score >= 400 && score <= 800) {
			System.out.println("You got the Gun");
			Gun g = new Gun();
			return g;
		} else {
			System.out.println("You got the Bomb");
			Bomb b = new Bomb();
			return b;
		}
	}

}
