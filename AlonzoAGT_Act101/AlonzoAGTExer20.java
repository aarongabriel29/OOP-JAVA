//EXERCISE 20
//INTERNET DELICATESSEN

import java.io.*;

public class AlonzoAGTExer20 {
	
	
	public static void main(String[] args) throws IOException {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        
        
                
        System.out.println("Enter the item: ");
        String itemStr = dataIn.readLine();
        
        
        System.out.println("Enter the price:" );
        String priceStr = dataIn.readLine();
        Double priceValue = Double.parseDouble(priceStr);
        
        Double ship = 0.0;
        
        
        if (priceValue < 10  ) {
        	 ship = 2.0;
        }
        else { 
        	ship = 3.0;
        }
        
        System.out.println("Overnight delivery (0==NO,1==YES)");
        String ONStr = dataIn.readLine();
        Double ONValue = Double.parseDouble(ONStr);
        
        Double ONPay = 0.0;
        
        if (ONValue == 1 ) {
        	ONPay = 5.0;
        }
        else { 
        	ONPay = 0.0;
        }
        
        
        Double ship1 =	ONPay+ship;
        Double ship2 =	priceValue +ship1;
        
        System.out.println("Invoice: ");
        System.out.println(itemStr+": " + priceStr);
        System.out.println("Shipping: "+ ship1);
        System.out.println("total: " +  ship2  );
        
    }

}


