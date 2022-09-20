package Collections;

import java.util.*;

public class PrimeNumber {

	public static void main(String[] args) {
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
		System.out.println(al);
	}

}
