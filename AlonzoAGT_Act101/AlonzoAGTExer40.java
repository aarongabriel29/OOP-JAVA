//EXERCISE 40
// SHIPPING COST CALC

import java.io.*;


public class AlonzoAGTExer40 {

	
	public static void main(String[] args) throws IOException {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        
        double weight = 1, shipping = 0;
        
        	while (true) {
	            System.out.println("Weight of Order:");
	            String w = dataIn.readLine();
	            weight = Double.parseDouble(w);
	            
            if (weight == 0)
                break;
            	shipping = 0;
            	
            	
            if (weight > 10)
                shipping += 5.5;
            
            
            else
                shipping += 3;
            
            
            System.out.println("Shipping cost: $" + shipping);
        }
        System.out.println("bye");
    }
    
}
