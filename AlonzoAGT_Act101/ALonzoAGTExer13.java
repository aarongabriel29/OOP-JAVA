// EXERCISE 13

import java.io.*;

public class ALonzoAGTExer13 {


	public static void main(String args[]) throws IOException {

		System.out.println("Enter X : ");
		BufferedReader x =new BufferedReader(new InputStreamReader(System.in));
		String xStr = x.readLine();
		Double xValue = Double.parseDouble(xStr);
		
		System.out.println("Enter Y : ");
		BufferedReader y =new BufferedReader(new InputStreamReader(System.in));
		String yStr = y.readLine();
		Double yValue = Double.parseDouble(yStr);
		
		Double ArithMean = (xValue + yValue)/2 ;
		System.out.println("Arithmetic Mean: " + ArithMean);
		
		Double HarMean = 2/(	(1/xValue)+ (1/yValue)	);
		System.out.println("Harmonic Mean: "+ HarMean);
		
		
		
	}	
}