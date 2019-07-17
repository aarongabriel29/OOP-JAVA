//EXERCISE 15
// ORDER CHECK

import java.io.*;

public class AlonzoAGTExer15 {

	public static void main(String args[]) throws IOException {
		
		System.out.println("Number of bolts: ");
		BufferedReader bolt =new BufferedReader(new InputStreamReader(System.in));
		String boltStr = bolt.readLine();
		Integer boltVal= Integer.parseInt(boltStr);
		
		System.out.println("Number of nuts: ");
		BufferedReader nut =new BufferedReader(new InputStreamReader(System.in));
		String nutStr = nut.readLine();
		Integer nutVal= Integer.parseInt(nutStr);
	
		System.out.println("Number of washers: ");
		BufferedReader washer =new BufferedReader(new InputStreamReader(System.in));
		String washerStr = washer.readLine();
		Integer washerVal= Integer.parseInt(washerStr);
	
		Integer boltPrice = boltVal*5;
		Integer nutPrice = nutVal*3;
		Integer washerPrice = washerVal*1;
		Integer result = boltPrice + nutPrice + washerPrice;
		
		
		if (boltVal > nutVal)
			System.out.println("CHECK THE ORDER");
		
		else
			System.out.println("ORDER IS OKAY");
		
		
		
		System.out.println("Total cost: "+ result);
		
		
	}
	
	
}
