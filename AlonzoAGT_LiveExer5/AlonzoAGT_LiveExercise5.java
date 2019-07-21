package AlonzoAGT_LiveExer5;
import javax.swing.*;


public class AlonzoAGT_LiveExercise5 {
	
	public static void main(String[] args) {
       
		
		Cellphone cp = new Cellphone();
        
        String input;
        
        input = JOptionPane.showInputDialog("Enter Initial load for C1");
        cp.paLoad(Integer.parseInt(input));
        
        String choices[] = {"Check Balance", "Text/Message","Re-load" , "Pasa-Load", "Exit"};
        String choices2[] = {"Text to same network", "Text to other networks" , "Text to overseas"};
        
        boolean flag = true;
        
        do{
            String choice = (String) JOptionPane.showInputDialog(null, "Choose one",
                    "Input", JOptionPane.DEFAULT_OPTION, null, choices, choices[0]);
                    
                    if (choice.equals("Re-load")){
                        input = JOptionPane.showInputDialog("Enter Re-load amount ");
                        cp.paLoad(Integer.parseInt(input));
                        
                    } else if (choice.equals("Text/Message")){
                        String choice2 = (String) JOptionPane.showInputDialog(null, "Choose one",
                        "Input", JOptionPane.DEFAULT_OPTION, null, choices2, choices2[0]);
                        
                        if (choice2.equals("Text to same network")){
                            cp.txt();
                            
                        } else if (choice2.equals("Text to other networks")){
                            cp.network();
                            
                        } else if (choice2.equals("Text to overseas")){
                            cp.overseas();
                            
                        }
                       
                    } else if (choice.equals("Check Balance")){
                        cp.chkbal();
                        
                    } else if (choice.equals("Pasa-Load")){
                        int amt;
                        input = JOptionPane.showInputDialog("Enter amount to pasa-load (C1 to C2)");
                        amt = Integer.parseInt(input);
                        cp.load -= amt;
                        
                        System.out.println("Operation Successful! ");
                        JOptionPane.showMessageDialog(null, "Operation Successful! ", "Prompt", JOptionPane.INFORMATION_MESSAGE);
                   
                    } else {
                        flag = false;                       
                        JOptionPane.showMessageDialog(null, "Exit normally! ", "Prompt", JOptionPane.INFORMATION_MESSAGE);
                        
                    }
                    
        } while (flag);
    }

}
