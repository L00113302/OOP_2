public class BankAccount
{
	//instance variables
	//accessSpec type varname;
   private double balance;
   private int accountNumber;
	
	//methods
	//accessSpec returntype varname(argList){}
	//return the balance
     
   public BankAccount(int accountNoIn, double openBalance)
   {
      accountNumber=accountNoIn;
      balance = balance+openBalance;
   }
   
   public BankAccount(int accountNoIn)
   {
      balance=0.00;
      accountNumber=accountNoIn;
   }
   
   public int getAccountNumber()
   {
      return accountNumber;
   }   
         
   public double getBalance()
   {
      return balance;
   }
	
	//reduce the balance by amount
   public void withdraw(double amount)
   {
      if(amount <= balance) //if enought money
         balance = balance - amount; //balance -=amount
   }
	//increase the balance by amount
   public void deposit(double amount)
   {
      balance = balance + amount;	
   }
	
	

}//end class