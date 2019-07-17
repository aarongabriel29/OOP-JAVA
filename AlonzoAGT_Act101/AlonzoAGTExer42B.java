//EXERCISE 42B


import java.io.*;

public class AlonzoAGTExer42B {

	
	public static void main(String[] args) throws IOException {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        
        
        System.out.println("Enter your balance:");
        String b = dataIn.readLine();
        double balance = Double.parseDouble(b);
        
        System.out.println("Enter the montly interest:");
        String in = dataIn.readLine();
        double monthlyInterest = Double.parseDouble(in);
        
        System.out.println("Enter the montly payment:");
        String M = dataIn.readLine();
        double monthlyPayment = Double.parseDouble(M);
        double  totalPayments = 0;
        
        int i = 1;
        while (balance > 0) {
            balance += balance * monthlyInterest / 100;
            balance -= monthlyPayment;
            totalPayments += monthlyPayment;
            System.out.println("Month: " + (i++) + "\tbalance: " + balance + " total payments: " + totalPayments);
        }
    }
}
