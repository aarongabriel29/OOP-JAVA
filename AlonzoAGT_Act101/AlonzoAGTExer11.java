//EXERCISE 11

import java.io.*;

public class AlonzoAGTExer11 {
	
	
	public static void main(String args[]) throws IOException {
		
		System.out.println("Enter the number of seconds: ");
		BufferedReader sec =new BufferedReader(new InputStreamReader(System.in));
		String secStr = sec.readLine();
		
		Float seconds = Float.parseFloat(secStr);
		
		float distance= (float) ((0.5)* (32.174*(Math.pow(seconds, 2))));
		
		System.out.println(distance +" feet");
		
		
	}

}
