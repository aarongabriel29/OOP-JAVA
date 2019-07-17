//EXERCISE 26
//MORE TIME PRESSURE

import java.io.*;

public class AlonzoAGTExer26 {
	
	public static void main(String[] args) throws IOException {
      
		BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        
        
        boolean goodPressure = true;
        
        String error = "Warning: Pressure is out of range\n";
        
        System.out.println("Input right front pressure");
        String rf = dataIn.readLine();
        int rightFront = Integer.parseInt(rf);
        if (rightFront < 35 || rightFront > 45) {
            goodPressure = false;
            System.out.println(error);
        }
       
        System.out.println("Input left front pressure");
        String lf = dataIn.readLine();
        int leftFront = Integer.parseInt(lf);
        if (leftFront < 35 || leftFront > 45) {
            goodPressure = false;
            System.out.println(error);
        }
        
        System.out.println("Input right rear pressure");
        String rr = dataIn.readLine();
        int rightRear = Integer.parseInt(rr);
        if (rightRear < 35 || rightRear > 45) {
            goodPressure = false;
            System.out.println(error);
        }
        
        System.out.println("Input left rear pressure");
        String lr = dataIn.readLine();
        int leftRear = Integer.parseInt(lr);
        if (leftRear < 35 || leftRear > 45) {
            goodPressure = false;
            System.out.println(error);
        
        }
        System.out.println("Inflation is " + (leftFront == rightFront && leftRear == rightRear  && goodPressure ? "OK" : "BAD"));
        
    }

}
