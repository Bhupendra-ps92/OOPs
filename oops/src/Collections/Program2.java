package Collections;

import java.util.ArrayList;

public class Program2 {
	public ArrayList<Integer> test() {

		ArrayList<Integer> al = new ArrayList<Integer>();

		for (int j = 1; j <= 20; j++) {
			int num = j;
			boolean result = true;
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					result = false;
					break;
				}
			}
			if (result) {
				al.add(num);
			}
		}
		return al;
	}

	public static void main(String[] args) {
		Program2 p = new Program2();
		ArrayList<Integer> arr = p.test();
		System.out.println(arr);

	}

}
