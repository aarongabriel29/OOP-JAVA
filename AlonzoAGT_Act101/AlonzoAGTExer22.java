//EXERCISE 22
//MICROWAVE OVEN
import java.io.*;

public class AlonzoAGTExer22 {

	
	public static void main(String[] args) throws IOException {
        
		BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
       
        System.out.println("Number of items:");
        String items = dataIn.readLine();
        int numVal = Integer.parseInt(items);
       
        System.out.println("Heating time:");
        String timeStr = dataIn.readLine();
        double time = Double.parseDouble(timeStr);
        
        switch(numVal) {
            case 1: break;
            case 2: time *= 1.50; break;
            case 3: time *= 2; break;
            default: time = 0;
            
            
        }
        
        System.out.println((time == 0 ? "NOT RECOMMENDED!" : "RECOMMENDED TIME: " + time));
    }
}
