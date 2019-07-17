//EXERCISE 23
//FANTASY GAME

import java.io.*;

public class AlonzoAGTExer23 {

	 public static void main(String[] args) throws IOException {
	        
		 BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
	          
	        
	        System.out.println("Welcome to Yertle's Quest");
	        System.out.println("Enter the name of your character:");
	        String nameVal = dataIn.readLine();
	        
	        System.out.println("Enter htrength (1-10):");
	        String StrengthStr = dataIn.readLine();
	        int strVal = Integer.parseInt(StrengthStr);
	        
	        System.out.println("Enter health (1-10):");
	        String HP = dataIn.readLine();
	        int hpVal = Integer.parseInt(HP);
	        
	        System.out.println("Enter luck (1-10):");
	        String LUCK = dataIn.readLine();
	        int luckVal = Integer.parseInt(LUCK);
	        
	        int total = strVal + hpVal + luckVal;
	        
	        if (total > 15) {
	            System.out.println("You have given your character too many points! Default values have been assigned:");
	            
	            strVal = 5;
	            hpVal = 5;
	            luckVal = 5;
	       
	        }
	        	System.out.println(nameVal + ", strength: " + strVal + ", health: " + hpVal + ", luck: " + luckVal);
	    }
		
}
