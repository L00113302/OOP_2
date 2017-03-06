// Bank Account tester
// Tester class for Bank Account
import java.util.Scanner;

public class BankACTester5
{
   public static void main(String[]args)
   {
   
   Scanner keyboardIn = new Scanner (System.in);

   BankAccount myAcc = new BankAccount();
      
   myAcc.setAccountNumber(12345678); 
   myAcc.getAccountNumber();
   
   System.out.println("Your account number is: " +myAcc.getAccountNumber());
   
   }
}   
   
     
