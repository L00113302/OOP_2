public class BankOfLYIT
{
   public static void main(String [] args)
   {  
	   // create an array of BankAccount objects
	  	BankAccount[] bank = new BankAccount[10];
		
		
		//load the array with bankaccount objects
		for(int i = 0; i < bank.length; i++)
			bank[i] = new BankAccount(i+1);  
		
		//display bankAccount objects	
		for(int i = 0; i < bank.length; i++)
			System.out.println(bank[i]);
			
		//create another bank account object - same as one existing
		BankAccount acc1 = new BankAccount(11, 0.0); 
	   BankAccount acc2 = new BankAccount(11, 0.0); 
		
		//test equals
		if(acc1.equals(acc2))
			System.out.print("the same" ); 
		else
			System.out.print("NOT the same" ); 
	
   }
}
