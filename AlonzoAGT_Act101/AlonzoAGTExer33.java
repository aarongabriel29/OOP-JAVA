//EXERCISE 33

import java.io.*;

public class AlonzoAGTExer33 {

	public static void main(String[] args) throws IOException {
       
		BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        
        double avg = 0, avgSq = 0;
        
        System.out.println("Enter N:");
        String n = dataIn.readLine();
        double N = Integer.parseInt(n);
       
        
        System.out.println("Enter the numbers:");
        for (int i = 0; i < N; i++) {
            String NUM = dataIn.readLine();
           
            double  num = Integer.parseInt(NUM);
            avg += num;
            avgSq += num * num;
        }
		        avg /= N;
		        avg *= avg;
		        avgSq /= N;
		    double sd = Math.sqrt(avgSq - avg);
        
		    System.out.println("Standard Deviation is: " + sd);
    }
		
}
