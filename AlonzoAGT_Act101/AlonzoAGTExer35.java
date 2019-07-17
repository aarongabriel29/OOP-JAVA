//EXERCISE 35
//POWER OF A NUMBER

import java.io.*;


public class AlonzoAGTExer35 {

		
	 public static void main(String[] args) throws IOException {
	        
		 	BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
	        
	        double ans = 1;
	        System.out.println("Enter X");
	        String xStr = dataIn.readLine();
	        double XVal = Double.parseDouble(xStr);
	        
	        System.out.println("Enter N");
	        String n = dataIn.readLine();
	        double N = Double.parseDouble(n);
	        if (N > 0) {
	            for (int i = 0; i < N; i++)
	                ans *= XVal;
	            System.out.println();
	            
	            System.out.println(XVal + " raised to the power of " + N + " is: " + ans);
	        }
	        
	        else
	            System.out.println("N must be a positive integer");
	    }
	    
}
