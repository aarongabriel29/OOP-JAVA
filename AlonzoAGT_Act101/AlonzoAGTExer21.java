//EXERCISE 21
// STEAM ENGINE EFFICIENCY

import java.io.*;


public class AlonzoAGTExer21 {

	  public static void main(String[] args) throws IOException {
	       BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
	      
	       
	       
	       System.out.println("Air temperature:");
	       String AtempStr = dataIn.readLine();
	       double AtempVal = Double.parseDouble(AtempStr);
	       
	       System.out.println("Steam temperature:");
	       String StempStr = dataIn.readLine();
	       double StempVal = Double.parseDouble(StempStr);
	       
	      if (StempVal< 373)
	    	  System.out.println("The Efficiency is 0.0");
	      else  
	    	  System.out.print("The Efficiency is " +( 1-(AtempVal/StempVal)));
	       
	     }
		
}
