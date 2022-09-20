package Collections;

public class SumOfArray {

	public static void main(String[] args) {
		int [] arr = {10,10,10,10};  
        int sum = 0;  
         
        for (int i: arr) {  
           sum= sum + i;  
        }  
        System.out.println("Sum of all the elements of an array: " + sum);
	}

}
