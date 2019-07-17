//EXERCISE 37
//PINE TREE

import java.io.*;

public class AlonzoAGTExer37 {

	
	 public static void main(String[] args) {
	        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
	        
	        for (int i = 0; i < 8; i++) {
	        	
	            for (int j = 0; j < 7 - i; j++)
	            	
	            	System.out.print(" ");
	            
	            for (int j = 0; j < 2 * i - 1; j++)
	             System.out.print("*");
	            System.out.println();
	        }
	        for (int i = 0; i < 3; i++)
	            System.out.println("   ***");
	    }
	    
	
}
