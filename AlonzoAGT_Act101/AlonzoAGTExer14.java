//EXERCISE 14
//DISCOUNT PRICES

import java.io.*;

public class AlonzoAGTExer14 {

	
	public static void main(String args[]) throws IOException {

		System.out.println("Enter amount of purchases : ");
		BufferedReader p =new BufferedReader(new InputStreamReader(System.in));
		String priceStr = p.readLine();
		Double price = Double.parseDouble(priceStr);
		Double ten = 10.00;
		Double discount = price* 0.10;
		Double result = price - discount;
		
		
		if (price <= ten)
			System.out.println("No DISCOUNT ");
		
		else if (price > ten)
			System.out.println("DISCOUNTED PRICE: " + result);
		else 
			System.out.println("INVALID INPUT");
		
		
	}
	
}	

	
	
	