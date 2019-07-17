//EXERCISE 29

import java.io.*;


public class AlonzoAGTExer29 {

	 public static void main(String[] args) throws IOException {
	        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
	        
	        System.out.println("Enter a word:");
	        String word = dataIn.readLine();

	        int times = word.length();
	        System.out.println();
	        for (int i = 0; i < times; i++)
	            System.out.println(word);
	    }
	 
}
