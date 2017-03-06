/*******************************
	Written by: Maeve Carr
	Date : 		
	Desc :	program to implement a simple BankAccount	
	Filename:	
*****************************/
/*

*/
public class BankAccount
{
   //instance variables
   private double balance; 
   private int AccountNumber;
   
   //methods
   //return the balance of BankAccount
   public double getBalance()
   {
      return balance;     
   }
   
   //reduces balance by amount
   public void withdraw(double amount)
   {
      balance = balance - amount;
      if(balance<amount)
      {
         System.out.println("Insufficient Funds!");
      } 
   }
   
   //increases balance by amount
   public void deposit(double amount)
   {
      balance = balance + amount;
   }
   
   public int getAccountNumber()
   {
      return AccountNumber;
   }
   
   public void setAccountNumber (int AccountNumberIn)
   {
      AccountNumber=AccountNumberIn;
   }
   
   
}//end class