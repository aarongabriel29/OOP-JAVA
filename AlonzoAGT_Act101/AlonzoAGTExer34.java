//EXERCISE 34
//ADDING UP SQUARES AND CUBES


import java.io.*;

public class AlonzoAGTExer34 {

	 public static void main(String[] args) throws IOException {
	       
		 BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
	        
	        int sumSquares = 0, sumCubes = 0;
	        
	        System.out.println("Upper limit:");       
	        String upper = dataIn.readLine();
	        
	        
	        int upperVal = Integer.parseInt(upper);
	        	for (int i = 1; i <= upperVal; i++) {
	        		int j = i * i;
			            sumSquares += j;
			            sumCubes += j * i;
		        }
	        System.out.println("The sum of Squares is: " + sumSquares);
	        
	        System.out.println("The sum of Cubes is: " + sumCubes);
	 
	 }
	 
}
