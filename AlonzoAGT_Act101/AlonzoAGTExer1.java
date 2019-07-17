//EXERCISE 1
//VALUE OF A QUADRATIC

import java.io.*;

public class AlonzoAGTExer1 {
	public static void main (String [] arg) throws IOException
	{
		BufferedReader findx = new BufferedReader (new InputStreamReader(System.in));
		
		System.out.println("3X^2-8x+4");
		System.out.println("Input the value of X:");
		
		String xvaluestring= findx.readLine();
		double xvalue= Double.parseDouble (xvaluestring);
		double xvalue_result= ((3*(Math.pow(xvalue,2)))-(8*xvalue)+4  );
		
		
		
		System.out.println("At " + xvalue +" the value is: "+ xvalue_result);
		
	}

}
