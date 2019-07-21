package AlonzoAGT_LiveExer5;


import javax.swing.*;

public class Cellphone {

int load;
    
    void paLoad(int money){
        if (money <= 0){
            
            JOptionPane.showMessageDialog(null, "Invalid amount! ", "Prompt", JOptionPane.ERROR_MESSAGE);
        }
        else {
            load += money;
        }
       
    }
    void network(){
        if (load > 1){
         load -= 2;
        
        JOptionPane.showMessageDialog(null, "Message Sent! ", "Prompt", JOptionPane.INFORMATION_MESSAGE);   
        }else {
            JOptionPane.showMessageDialog(null, "Insufficient load! ", "Prompt", JOptionPane.ERROR_MESSAGE);
        }
   }
    
    void overseas(){
        if (load > 4){
        	
         load -= 5;
        
        JOptionPane.showMessageDialog(null, "Message Sent! ", "Prompt", JOptionPane.INFORMATION_MESSAGE);   
        }else {
            JOptionPane.showMessageDialog(null, "Insufficient load! ", "Prompt", JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
    
     
    void txt(){
        if (load > 0){
        	
            load--;
           
            JOptionPane.showMessageDialog(null, "Message Sent! ", "Prompt", JOptionPane.INFORMATION_MESSAGE);
            
        }
        else {
           
            JOptionPane.showMessageDialog(null, "Insufficient load! ", "Prompt", JOptionPane.ERROR_MESSAGE);
        }
        
    }
    void chkbal(){
       
        JOptionPane.showMessageDialog(null, "Your current balance is " + load, "Prompt", JOptionPane.INFORMATION_MESSAGE);
    }
    
	
}
