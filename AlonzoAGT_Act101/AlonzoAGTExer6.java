//EXERCISE 6
//DEGREES TO RADIUS

import java.io.*;

public class AlonzoAGTExer6 {
		public static void main(String args[]) throws IOException {
			
			System.out.println("Input the radius:");
			BufferedReader inputvalue=new BufferedReader(new InputStreamReader(System.in));
	        
	        String valueStr= inputvalue.readLine();
	        Double valueRadius= Double.parseDouble(valueStr);
	        
	        Double area= (Math.PI*valueRadius*valueRadius);
	        
	        System.out.println(area);


	    }
}
