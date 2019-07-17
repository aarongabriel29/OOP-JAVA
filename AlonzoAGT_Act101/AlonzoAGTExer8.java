//EXERCISE 8
// CORRECT CHANGE

import java.io.*;

public class AlonzoAGTExer8 {
	
		public static void main(String args[]) throws IOException {
		
			System.out.println("Input the cents:");
			BufferedReader cents =new BufferedReader(new InputStreamReader(System.in));
			String centValue = cents.readLine();
			
			Integer centavos = Integer.parseInt(centValue);
			
			Integer dollar = centavos/100;
			Integer dollarRemain = centavos%100;
			Integer quarters = dollarRemain/25;
			Integer quartersRemain = dollarRemain%25;
			Integer dime = quartersRemain/10;
			Integer dimeRemain = quartersRemain%10;
			Integer nickles = dimeRemain/5;
			Integer lastCentavos = dimeRemain%5;
			
			System.out.println(dollar+ " dollar/s , " + quarters + " quarter/s , " + dime + " dime/s ,"+ nickles + " nickle/s , and " + lastCentavos + " cent/s. " );
			
	}	

}
