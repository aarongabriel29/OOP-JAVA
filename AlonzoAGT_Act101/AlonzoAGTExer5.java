//EXERCISE 5
//DEGEREES TO RADIANS

import java.io.*;

public class AlonzoAGTExer5 {
	 public static void main(String args[]) throws IOException {
		    
		 		System.out.print("degrees value:");
		    	BufferedReader inputvalue=new BufferedReader(new InputStreamReader(System.in));       
		        String valueStr= inputvalue.readLine();
		        Double valueInt= Double.parseDouble(valueStr);
		        Double radValue= valueInt*Math.PI/180;
		        
		        
		        Double sinValue= Math.sin(radValue);
		        Double cosValue= Math.cos(radValue);
		        Double resultValue= ( (Math.pow(sinValue,2)) + (Math.pow(cosValue,2))   );
		        
		        
		        System.out.println("sine: " + sinValue + "  cosine: " + cosValue + "  result: " + resultValue);
		        
		        

		    }

}
