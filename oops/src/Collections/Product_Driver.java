package Collections;

import java.util.*;

public class Product_Driver {

	public static void main(String[] args) {
		ArrayList<Product> al = new ArrayList<Product>();
		al.add(new Product("Vivo",45000));
		al.add(new Product("Samsung", 50000));
		al.add(new Product("Apple", 60000));

		for (Product p : al) {
			System.out.println("" + p.name);
			System.out.println("" + p.price);
		}

	}

}
