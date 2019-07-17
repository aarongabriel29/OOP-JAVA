//EXERCISE 32

import java.io.*;

public class AlonzoAGTExer32 {
	
	
	public static void main(String[] args) throws IOException {
       
		BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        
       
        double sum = 0;
        
        System.out.println("Enter N:");
        String num = dataIn.readLine();
        int NVal = Integer.parseInt(num);
        
        
        	for (int i = 1; i <= NVal; i++)
        		sum += 1.0 / i;
        
       
        	System.out.println("Sum is: " + sum);
    }
}
