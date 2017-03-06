/*
	Written by : Maeve Carr
	Date:
	Desc:
*/



public class ArrayOfBankAccountsTester
{
   public static void main(String [] args)
   {  
	   // create an Array of BankAccount objects
	   BankAccount[] accounts = new BankAccount[10];
      
      //load the array with BankAccount objects
      for(int i = 0; i < accounts.length; i++)
      {
         accounts[i] = new BankAccount(i + 1); //will load with bank accounts numbered 1 to 10
      }  
      
      //display details of each bankaccount object in the array 
      for(int i = 0; i < accounts.length; i++)
      {
         System.out.println("Acc# "+ accounts[i].getAccNumber() +"  Balance €" +  accounts[i].getBalance()); //
      }

	   
   }
}
