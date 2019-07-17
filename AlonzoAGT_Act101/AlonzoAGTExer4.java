
//EXERCISE 4
//TRIGONOMETRY

import java.io.*;

public class AlonzoAGTExer4 {
	public static void main (String [] arg) throws IOException
	{
		 	System.out.print("value:");
		 	BufferedReader inputvalue=new BufferedReader(new InputStreamReader(System.in));
	       
	        String valueStr= inputvalue.readLine();
	        Double valueInt= Double.parseDouble(valueStr);
	        
	        Double sinValue= Math.sin(valueInt);
	        Double cosValue= Math.cos(valueInt);
	        Double resultValue= ( (Math.pow(sinValue,2)) + (Math.pow(cosValue,2))   );
	        
	        
	        
	    System.out.println("sine: " + sinValue + "   cosine: " + cosValue + "   result: " + resultValue);

	
	}


}
