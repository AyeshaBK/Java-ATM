import javax.swing.JOptionPane;

public class ATM{
   
   public static int balance = 5000;
   
   public static void main(String[] args){
      
      JOptionPane.showMessageDialog(null, "Welcome to Standard Bank");
      
      enterPin();
      
      int option = Integer.parseInt(JOptionPane.showInputDialog("Choose from the options below : \n1. Check Balance " + 
                      "\n2. Deposit \n3. Withdraw \n4. Exit")); 
      
      if(option == 1){
         JOptionPane.showMessageDialog(null,"You have R" + balance + " in your account");
      }
                                                   
      else if(option == 2){
        
        int d = Integer.parseInt(JOptionPane.showInputDialog("Enter amount to deposit : "));
        
            if(d < 10 || d >= 101){
               JOptionPane.showMessageDialog(null, "You cannot deposit more than R100 and less than R10");
            }
            else{
               JOptionPane.showMessageDialog(null, "You have deposited R" + d + "\n You have R" + deposit(d) + " in your account");
            }
         
      }
      
      else if(option == 3){
         
         int w = Integer.parseInt(JOptionPane.showInputDialog("Enter amount to withdraw : " ));
            
            JOptionPane.showMessageDialog(null, "You withdrew R" + w + "\n Your balance is now R" + withdraw(w));
      }
      
      else{
         System.exit(0);
      }
   }
   public static void enterPin(){
      
      String pin = "123";
      
      String userPin = JOptionPane.showInputDialog("Please enter pin : ");
      
      if(userPin.equals(pin)){
         JOptionPane.showMessageDialog(null, "Correct pin \n Welcome Miss Ayesha");
      }
      else{
         JOptionPane.showMessageDialog(null, "Incorrect pin");
         System.exit(0);
      }
   }
   
   public static double deposit(int amount){
      
      double depositAmnt = balance + amount;
      return depositAmnt;
   }
  
   public static double withdraw(int amount){
      
         double withdrawalAmnt = balance - amount;
         return withdrawalAmnt;
   }
}