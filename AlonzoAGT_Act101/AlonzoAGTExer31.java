//EXERCISE 31
//ADDING UP INTEGERS

import java.io.*;


public class AlonzoAGTExer31 {

	 public static void main(String[] args) throws IOException {
	        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
	        
	        int times, num, sum = 0;
	        
	        System.out.println("How many integers will be added:");
	        String t = dataIn.readLine();
	        times = Integer.parseInt(t);
	        
	        
	        for (int i = 0; i < times; i++) {
	            System.out.println("Enter an integer:");
	            String n = dataIn.readLine();
	            num = Integer.parseInt(n);
	            sum += num;
	        }
	        System.out.println();
	        System.out.println("The sum is: " + sum);
	    }
		
}
