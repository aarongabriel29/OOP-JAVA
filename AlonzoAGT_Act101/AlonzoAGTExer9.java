//EXERCISE 9
// OHM'S LAW

import java.io.*;

public class AlonzoAGTExer9 {
		
	public static void main(String args[]) throws IOException {
		
		System.out.println("Voltage:");
		BufferedReader volt =new BufferedReader(new InputStreamReader(System.in));
		String voltStr= volt.readLine();
		Integer voltage = Integer.parseInt(voltStr);
		
		
		System.out.println("Resistance:");
		BufferedReader ohm =new BufferedReader(new InputStreamReader(System.in));
		String resistanceStr= ohm.readLine();
		Integer resistance = Integer.parseInt(resistanceStr);
		
		Double result = (voltage + 0.0)/resistance;
		
		System.out.println("Current(I) = " + result + " ampere/s");
		
		
	}
}
