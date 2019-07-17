//EXERCISE 43
// DRUG POTENCY

import java.io.*;

public class AlonzoAGTExer43 {

	public static void main(String[] args) throws IOException {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter effectiveness:");
        int month = 0;
        String e = dataIn.readLine();
        double effectiveness = Double.parseDouble(e);
        double half = effectiveness / 2;
        while (true) {
            System.out.print("month: " + (month++) + "\teffectiveness: " + effectiveness);
            effectiveness *= 0.96;
            if (effectiveness < half) {
                System.out.println();
                System.out.println("month: " + month + "\teffectiveness: " + effectiveness + " DISCARDED");
                break;
            }
            System.out.println();
        }
    }
}
