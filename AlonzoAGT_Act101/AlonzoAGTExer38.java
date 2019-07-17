//EXERCISE 38
//MILES PER GALLON

import java.io.*;

public class AlonzoAGTExer38 {

	
	public static void main(String[] args) throws IOException {
		
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        
        
        System.out.println("Miles Per Gallon Program");
        System.out.println("Initial Miles:");
        String in = dataIn.readLine();
        double init = Double.parseDouble(in);
        
        	if (init < 0)
        		System.out.println("bye");
        	
        	
        	else {
	            System.out.println("final Miles:");
	            String f = dataIn.readLine();
	            double fin = Double.parseDouble(f);
	            
	            System.out.println("Gallons");
	            String g = dataIn.readLine();
	            double gal = Double.parseDouble(g);
	            
	            double miles = (fin - init) / gal;
	            System.out.println("Miles per Gallon: " + miles);
        } 
    }
}
