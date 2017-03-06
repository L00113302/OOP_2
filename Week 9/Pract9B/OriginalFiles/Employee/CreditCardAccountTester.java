import java.util.Scanner;

public class CreditCardAccountTester
{
   public static void main(String[]args)
   {
   
      Scanner keyboardIn = new Scanner (System.in);

      int option=0;
      double creditLimit=0.00;
      double amount=0.00;
      
      System.out.println ("Set the Credit Limit: ");
      creditLimit=keyboardIn.nextDouble();
      
           
            
      CreditCardAccount CCA1 = new CreditCardAccount("Mark Glenn");
      CCA1.setCreditLimit(creditLimit);

      
      
      System.out.println("*******Credit Card Account Menu*******");
      System.out.println(" 1. Make Purchase.");
      System.out.println(" 2. Make Payment.");
      System.out.println(" 3. View Balance. ");
      System.out.println(" 4. Available Funds. ");
      System.out.println(" 5. Exit System. ");
      System.out.println();
      
      do
      {
                 
         System.out.println("Please enter an option: ");
         option = keyboardIn.nextInt();
         
         switch(option)
         {
         case 1: System.out.println(" 1. Make Purchase ");
                 amount=keyboardIn.nextDouble();
                 CCA1.makePurchase(amount);
                 break;
           
         case 2: System.out.println(" 2. Make Payment ");
                 amount=keyboardIn.nextDouble();
                 CCA1.makePayment(amount);
                 break;
            
         case 3: System.out.println(" 3. View Balance ");
                 {
                     System.out.println(" The balance is: " + CCA1.getBalance());
                 }
                 break;
         
         case 4: System.out.println(" 4. Available Funds ");
                 {
                     System.out.println(" Available Funds: " +CCA1.availFunds());
                 }
                 break;           
         }        
                 
         }while(option!=5);       
        
  }
} 
          