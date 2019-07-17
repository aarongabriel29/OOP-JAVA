//EXERCISE 19
//Y2K PROBLEM DETECTOR

import java.io.*;


public class ALonzoAGTExer19 {
			
	 public static void main(String[] args) throws IOException {
	        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
	        
	        System.out.println("Year of Birth:");
	        String yearStr = dataIn.readLine();
	        int yearValue = Integer.parseInt(yearStr);
	        
	        System.out.println("Current year:");
	        String currentStr = dataIn.readLine();
	        int currentValue = Integer.parseInt(currentStr);
	        
	        if (currentValue < yearValue)
	            currentValue += 100;
	        
	        System.out.println("Your age: " + (currentValue - yearValue));
	    }
	
	
	
	
}
