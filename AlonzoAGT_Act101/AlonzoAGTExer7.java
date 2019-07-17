//EXERCISE 7
//CENT TO DOLLARS


import java.io.*;

public class AlonzoAGTExer7 {
	public static void main(String args[]) throws IOException {
		
		System.out.println("Input the cents:");
		BufferedReader cents =new BufferedReader(new InputStreamReader(System.in));
		
		String centStr= cents.readLine();
		Integer centValueInt= Integer.parseInt(centStr);
		Integer centValueDouble= Integer.parseInt(centStr);
		
		Integer lessCentavos = centValueInt;
		Integer dollar= centValueInt/100;
		Integer centavos= centValueDouble%100;
		
	
			if ( (centValueInt|centValueDouble) < 100 ) 
				System.out.println("That is: " +lessCentavos + " cents");
			
			else if ( (centValueInt|centValueDouble) == 100 )
				System.out.println("That is: " + dollar + " dollar");
			
			else if ( (centValueInt|centValueDouble) >100 )
				System.out.println("That is: " + dollar + " dollars and " + centavos + " cents");
					
			else System.out.println("INVALID INPUT");
		
	
				
		
		
	}
}
