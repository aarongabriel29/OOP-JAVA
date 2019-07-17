//EXERCISE 17
//PIE EATING CONTEST

import java.io.*;


public class AlonzoAGTExer17 {

	  public static void main(String[] args) throws IOException {
		  
		  	System.out.println("Enter weight in pounds:");
		  	BufferedReader weight = new BufferedReader(new InputStreamReader(System.in));
	        
	        String weightStr= weight.readLine();
	        int weightInt = Integer.parseInt(weightStr);
	        
	        if (weightInt >= 30 && weightInt <= 250) 
	        		System.out.println("YOU ARE ALLOWED!");
	        
	        else 
	        		System.out.print("YOU ARE NOT ALLOWED!");
	        
	        	
	        	
	    }
	
	
	
}
	