//EXERCISE 12

import java.io.*;

public class AlonzoAGTExer12 {

	public static void main(String args[]) throws IOException {

		System.out.println("Enter a double : ");
		BufferedReader log =new BufferedReader(new InputStreamReader(System.in));
		String logStr = log.readLine();
		Float  logFL = Float.parseFloat(logStr);
		
		Float logValue = (float)(	(Math.log(logFL + 0.0))/ (Math.log(2+ 0.0)));
		
		System.out.println("Base 2 log of "+ logFL+ " is " + logValue);
		
		
	}	
		
}
