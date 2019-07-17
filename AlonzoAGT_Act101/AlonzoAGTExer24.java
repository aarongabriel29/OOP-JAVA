//EXERCISE 24
//CHECK CHARGE
import java.io.*;

public class AlonzoAGTExer24 {

	 public static void main(String[] args) throws IOException {
	        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
	       
	       
	        double charge;
	        
	        System.out.println("Checking Balance:");
	        String c = dataIn.readLine();
	        int check = Integer.parseInt(c);
	        
	        System.out.println("Saving Balance:");
	        String s = dataIn.readLine();
	        int save = Integer.parseInt(s);
	        
	        if (check > 1000 || save > 1500)
	             charge = 0;
	        else
	            charge = 0.15;
	        
	        System.out.println("Charge: " + charge);
	    }
	
}

