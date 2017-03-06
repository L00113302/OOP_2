public class CreditCardAccount
{
	// instance variables
	private static int nextAccNum=1;
	private int accountNumber;
	private String customerName;
   private double balance;
   private double creditLimit;
    
	public CreditCardAccount(String NameIn)
	{
		accountNumber = nextAccNum++;
		customerName = NameIn;
		balance = 0.00;
      creditLimit = 0.00;
	}
	
	public int getAccountNumber()
   {
   return accountNumber;
   }
	
	
	public double getBalance()
	{	
		return balance;		
	}

   public void setCreditLimit(double limitIn)
   {
      creditLimit = limitIn;
   }
   
   public void makePurchase (double purchase)
   {
   if ((purchase+balance) <= creditLimit)
      {
         balance=balance+purchase;
      }
      else
      {
         System.out.println ("You have gone over your credit limit!");
      }
   }
   
   public void makePayment (double payment)
   {
      balance=balance-payment;
   }
   
   public double availFunds()
   {
      double availBalance=0.00;
      return availBalance=creditLimit-balance;
   }   
   
   public String toString()
   {
   String str = " ";
      return str= "Customer Name: " +customerName +"\n AC Number" +accountNumber +"\n Balance: " +balance;
   }
}      