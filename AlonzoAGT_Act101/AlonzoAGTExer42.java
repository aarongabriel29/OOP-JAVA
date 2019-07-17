//EXERCISE 42
//CREDIT CARD BILL

import java.io.*;

public class AlonzoAGTExer42 {

	 public static void main(String[] args) throws IOException {
	        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
	        
	        double balance = 1000, totalPayments = 0;
	        System.out.println("Enter the montly payment:");
	        String M = dataIn.readLine();
	        
	        double monthlyPayment = Double.parseDouble(M);
	        
	        
	        int i = 1;
	        	while (balance > 0) {
		            balance += balance * 0.015;
		            balance -= monthlyPayment;
		            totalPayments += monthlyPayment;
		            System.out.println("Month: " + (i++) + "\tbalance: " + balance + " total payments: " + totalPayments);
	        }
	    }
}
