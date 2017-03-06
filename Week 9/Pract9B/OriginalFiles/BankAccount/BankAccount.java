
public class BankAccount
{
	//instance variables
	//accessSpec type varname;
	private double balance;
   private int accNumber;
   public static int nextAccNo = 1;
	
	public BankAccount(int accNoIn)
	{
		accNumber = nextAccNo++;
		balance = 0.0; 
	}

	public BankAccount(int accNoIn,double openBal)
	{
		accNumber = nextAccNo++;
		balance = openBal; 
	}
	//methods
	//accessSpec returntype varname(argList){}
	//return the balance
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
	
	public int  getAccNumber()
	{
		return accNumber;	
	}
   public String toString()
   {
      return "Account Number: " +accNumber +", Balance: " +balance; 
   
   }
	
}//end class