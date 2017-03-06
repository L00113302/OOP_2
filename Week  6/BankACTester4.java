// Bank Account tester
// Tester class for Bank Account
import java.util.Scanner;

public class BankACTester4
{
   public static void main(String[]args)
   {
   
      Scanner keyboardIn = new Scanner (System.in);
   
      BankAccount myAcc = new BankAccount();
      int option=0;
      
      System.out.println("\t********LYIT BANK******** ");
      System.out.println("\t 1. Deposit");
      System.out.println("\t 2. Withdraw");
      System.out.println("\t 3. Get balance");
      System.out.println("\t 4. Quit");
      System.out.println();
           
   
   
      do
      {
         System.out.println("\t\t Please Select Option: ");
         option = keyboardIn.nextInt();
      
         switch(option)
         {
            case 1:
               System.out.print("Enter deposit: ");
               double deposit = keyboardIn.nextDouble();
               myAcc.deposit(deposit);
               break;
            case 2:
               System.out.println("Enter withdraw: ");
               double withdraw = keyboardIn.nextDouble();
               myAcc.withdraw(withdraw);
               break;
            case 3: myAcc.getBalance();
               System.out.println("Balance: " +myAcc.getBalance());
               break;
         }
      }while(option!=4);
      
   
   }
}