//EXERCISE 30


import java.io.*;

public class AlonzoAGTExer30 {

	public static void main(String[] args) throws IOException {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        
        String word1, word2;
        
        System.out.println("Enter first word:");
        word1 = dataIn.readLine();
        
        System.out.println("Enter second word:");
        word2 = dataIn.readLine();
        
        System.out.println();
        System.out.print(word1);
        
        int dotLength = 30 - word1.length() - word2.length();
        
        for (int i = 0; i < dotLength; i++)
            System.out.print(".");
            System.out.println(word2);
    }
}
