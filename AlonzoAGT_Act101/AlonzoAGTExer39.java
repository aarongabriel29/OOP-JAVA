//EXERCISE 39
//IN-RANGE ADDER

import java.io.*;

public class AlonzoAGTExer39 {

	public static void main(String[] args) throws IOException {
      
		BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        
        int  inRange = 0, notInRange = 0;
        
        System.out.println("In-range Adder");
        
        System.out.println("Low end of range:");
        String l = dataIn.readLine();
        int low = Integer.parseInt(l);
        
        System.out.println("High end of range:");
        String h = dataIn.readLine();
        int high = Integer.parseInt(h);
        
        	while (true) {
	            System.out.println("Enter data:");
	            String d = dataIn.readLine();
	            int	data = Integer.parseInt(d);
            
            if (data == 0)
                break;
            
            if (data >= 20 && data <= 50)
                inRange += data;
            
            else
                notInRange += data;
        }
        	
        System.out.println("Sum of in range values: " + inRange);
        System.out.println("Sum of out range values: " + notInRange);
    
	}
    
}
