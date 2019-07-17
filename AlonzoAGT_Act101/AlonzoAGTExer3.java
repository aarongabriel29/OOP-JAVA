//EXERCISE 3
// AVERAGE RAIN FALL
import java.io.*;

public class AlonzoAGTExer3 {
	public static void main (String [] arg) throws IOException
	{
		
		System.out.println("Rainfall for April:"+'\t');
		BufferedReader April= new BufferedReader (new InputStreamReader(System.in));
		String AprilStr= April.readLine();	
		Double AprilInt= Double.parseDouble (AprilStr);
		
		System.out.println("Rainfall for May:"+'\t');
		BufferedReader May= new BufferedReader (new InputStreamReader(System.in));
		String MayStr= May.readLine();
		Double MayInt= Double.parseDouble(MayStr);
		
		System.out.println("Rainfall for June:"+'\t');
		BufferedReader June= new BufferedReader (new InputStreamReader(System.in));
		String JuneStr= June.readLine();
		Double JuneInt= Double.parseDouble(JuneStr);
		
		Double result= (AprilInt+ MayInt + JuneInt)/3 ;
		
		
		
		System.out.println("Average Rainfall:" + result);
		
		
	
	}

}
