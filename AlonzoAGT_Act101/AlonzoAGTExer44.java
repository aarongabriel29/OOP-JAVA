//EXERCISE 44
// e^X

import java.io.*;


public class AlonzoAGTExer44 {

	 public static void main(String[] args) throws IOException {
	        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
	        final double epsilon = 1E-12;
	        
	        System.out.println("Enter x:");
	        String XStr = dataIn.readLine();
	        int x = Integer.parseInt(XStr);
	        int n = 1;
	        
	        double term, sum = 1, N = x, f = 1;
	        while (true) {
	        
	        	term = N / f;
	            
	        	sum += term;
	            	System.out.println("n:" + n + " term: " + term + "\tsum: " + sum);
	            n++;
	            if (term < epsilon)
	                break;
	            N *= x;
	            f *= n;
	        }
	        System.out.println("my e^x: " + sum);
	        
	        System.out.println("real e^x: " + Math.exp(x));
	    }
	    
	
}

