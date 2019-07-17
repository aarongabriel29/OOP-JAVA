//EXERCISE 10

import java.io.*;

public class AlonzoAGTExer10 {



		public static void main(String args[]) throws IOException {
	
			System.out.println("Cost per kilowatt-hour: ");
			BufferedReader kwh1 =new BufferedReader(new InputStreamReader(System.in));
			String kwhCostStr= kwh1.readLine();
			Double kwhCost = Double.parseDouble(kwhCostStr);
			
			
			System.out.println("Number of kilowatt-hour per year: ");
			BufferedReader kwh2 =new BufferedReader(new InputStreamReader(System.in));
			String kwhAnnualStr= kwh2.readLine();
			Double kwhAnnual = Double.parseDouble(kwhAnnualStr);
			
			Double result = kwhCost * kwhAnnual;
			
			System.out.println("Annual cost: "+ result);
			
			
			
		}

}