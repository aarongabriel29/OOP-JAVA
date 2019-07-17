//EXERCISE 36
//WEDGE OF STARS

import java.io.*;

public class AlonzoAGTExer36 {

	public static void main(String[] args) throws IOException {
       
		BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        
       
		System.out.println("Initial number of stars:");
		String stars = dataIn.readLine();
		
        int StarsVal = Integer.parseInt(stars);
        	
        	for (int i = 0; i < StarsVal; i++) {
            for (int j = 1; j <= StarsVal - i; j++)
            
            	System.out.print("*");
            	
            	System.out.println();
        }    
    }
	
}
