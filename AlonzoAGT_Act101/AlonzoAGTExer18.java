//EXERCISE 18
//GROUND BEEF VALUE CALCULATOR
import java.io.*;

public class AlonzoAGTExer18 {

	 public static void main(String[] args) throws IOException {
	        BufferedReader raw = new BufferedReader(new InputStreamReader(System.in));
	        
	        double priceA, priceB, percentA, percentB;

	        System.out.println("Price per pound package A:");
	        String a1 = raw.readLine();
	        priceA = Double.parseDouble(a1);
	        
	        System.out.println("Percent lean package A:");
	        String a2 = raw.readLine();
	        percentA = Double.parseDouble(a2);
	        
	        System.out.println("Price per pound package B:");
	        String b1 = raw.readLine();
	        priceB = Double.parseDouble(b1);
	        
	        System.out.println("Percent lean package B:");
	        String b2 = raw.readLine();
	        percentB = Double.parseDouble(b2);
	        
	        percentA /= 100;
	        percentB /= 100;
	        
	        double packageA = priceA * (2 - percentA), packageB = priceB * (2 - percentB);
	        
	        System.out.println("Package A cost per pound of lean:" + packageA);
	        System.out.println("Package B cost per pound of lean:" + packageB);
	        System.out.println(packageA < packageB ? "Package A is the best Value" : "Package B is the best Value");
	    }
	
}
