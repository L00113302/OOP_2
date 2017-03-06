// Bank Account tester
// Tester class for Bank Account

public class BankACTester
{
   public static void main(String[]args)
   {
   // create an instance of a type Oblong
   BankAccount myAcc = new BankAccount();
   
   // use methods to create instance variables
   myAcc.deposit(300);
   myAcc.withdraw(25);
   
   // use methods to retrieve values of instance variables
   System.out.println("Balance: " +myAcc.getBalance());
      
   }
}   