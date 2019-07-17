//EXERCISE 16
//LAST CHANCE GAS

import java.io.*;


public class AlonzoAGTExer16 {
	
	
	public static void main(String args[]) throws IOException {
		
		System.out.println("Tank capacity: ");
		BufferedReader tank =new BufferedReader(new InputStreamReader(System.in));
		String tankStr = tank.readLine();
		Integer tankVal = Integer.parseInt(tankStr);
		
		System.out.println("Gage reading: ");
		BufferedReader gage =new BufferedReader(new InputStreamReader(System.in));
		String gageStr = gage.readLine();
		Integer gageVal = Integer.parseInt(gageStr);
		
		System.out.println("Miles per gallon: ");
		BufferedReader mpg =new BufferedReader(new InputStreamReader(System.in));
		String mpgStr = mpg.readLine();
		Integer mpgVal = Integer.parseInt(mpgStr);
		
		
		double gageToPer = (gageVal+0.0) /100;
		double  tankgage = gageToPer*tankVal;
		double miles =tankgage*mpgVal;
		
		if (miles<200)
			System.out.println("Get Gas!");
		else 
			System.out.println("Safe To Proceed!");
	
		
		
		
		
	}

}
