package Upcasting_Downcasting_Overriding;

public class Player {
	static String playerName = "Jack";

	public static void main(String[] args) {
		Game g = new Game();
		Weapon w = g.pressButton();
		w.use();
	}
}
