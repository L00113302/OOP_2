import java.util.Scanner;

public class CreditCardAccountTester
{
   public static void main(String[]args)
   {
   
      Scanner keyboardIn = new Scanner (System.in);

      int option=0;
      double limit=0.00;
      
      System.out.println ("Set the Credit Limit: ");
      
            
      CreditCardAccount CCA1 = new CreditCardAccount();
      
      
      System.out.println("*******Credit Card Account Menu*******");
      System.out.println(" 1. Make Purchase.");
      System.out.println(" 2. Make Payment.");
      System.out.println(" 3. View Balance. ");
      System.out.println(" 4. Exit System. ");
      System.out.println();
      
      do
      {
                 
         System.out.println("Please enter an option: ");
         option = keyboardIn.nextInt();
         
         switch(option)
         {
         case 1: System.out.println(" 1. Make Purchase ");
                 CCA1.makePurchase();
                 break;
           
         case 2: System.out.println(" 2. Make Payment ");
                 CCA1.makePayment();
                 break;
            
         case 3: System.out.println(" 3. View Balance ");
                 {
                     System.out.println(" The balance is: " + CCA1.getBalance());
                 }
                 break;
         }        
                 
         }while(option!=4);       
        
  }
}           