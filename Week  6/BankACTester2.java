// Bank Account tester
// Tester class for Bank Account
import java.util.Scanner;

public class BankACTester2
{
   public static void main(String[]args)
   {
   
   Scanner keyboardIn = new Scanner (System.in);

   BankAccount myAcc1 = new BankAccount();
   BankAccount myAcc2 = new BankAccount();
   double deposit1=0.00, deposit2=0.00;
   
   System.out.println("Please enter the first deposit: ");
   deposit1 = keyboardIn.nextDouble();
   
   System.out.println("Please enter the second deposit: ");
   deposit2 = keyboardIn.nextDouble();
   
   myAcc1.deposit(deposit1);
   myAcc2.deposit(deposit2); 
   
   myAcc1.getBalance();
   myAcc2.getBalance();
   
   if(myAcc1.getBalance()>myAcc2.getBalance())
   {
   System.out.println("Balance Acc 1: " +myAcc1.getBalance());
   }
   
   else if(myAcc2.getBalance()>myAcc1.getBalance())
   {
   System.out.println("Balance Acc 2: " +myAcc2.getBalance());
   }
   
   else
   {
   System.out.println("Both Accounts have equal balance.");
   }
      
   }
}  