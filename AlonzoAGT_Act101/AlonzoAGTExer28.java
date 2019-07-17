//EXERCISE 28


import java.io.*;

public class AlonzoAGTExer28 {

	
	 public static void main(String[] args) throws IOException {
	        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
	        
	        int start, end;
	        
	        System.out.println("Enter Start:");
	        String s = dataIn.readLine();
	        start = Integer.parseInt(s);
	        
	        System.out.println("Enter End:");
	        String e = dataIn.readLine();
	        end = Integer.parseInt(e);
	        
	        System.out.println();
	        for (int i = start; i <= end; i++)
	            System.out.println(i);
	    }
}


