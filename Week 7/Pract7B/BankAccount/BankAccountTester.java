public class BankAccountTester
{
   public static void main(String [] args)
   {  
	   // create an instance of type Dog
	   BankAccount myAccount1 = new BankAccount(123456);
      BankAccount myAccount2 = new BankAccount(1235678, 2000);
	   
	   System.out.println ("Account Number: " +myAccount1.getAccountNumber());
      		
		System.out.println("Initial Balance " +myAccount1.getBalance() );
		
		myAccount1.deposit(100);   
	
		System.out.println("After calling deposit(100) balance is:  " +myAccount1.getBalance() );
		
		myAccount1.withdraw(15);   
	
		System.out.println("After calling withdraw(15) balance is:  " +myAccount1.getBalance() );
      
      System.out.println("Initial Balance " +myAccount2.getBalance() );
      
      myAccount2.deposit(200);   
	
		System.out.println("After calling deposit(100) balance is:  " +myAccount2.getBalance() );
		
		myAccount2.withdraw(45); 
      
      

   }
}
