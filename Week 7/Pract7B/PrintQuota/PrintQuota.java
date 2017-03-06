/*
	Written by : Maeve Carr
	Date:
	Desc:	A program that will .....
	FileName: 
*/


/**
   All students have a print quota which allows them to print. 
    The cost of printing a page is 5 cent.  
    The print quota can be topped up at any time.  
    A student may also need to know the amount left in both euro and pages 
    (i.e. the number of pages that they can print).  
    Design a PrintQuota class.  
*/
public class PrintQuota
{
   //instance variables 
   private double balance;
   private double costPerPage; 
   
   // constructors
   public PrintQuota()
   {
   balance=0.0;
   costPerPage=0.10;
   }
   
   public PrintQuota(double cppIn)
   {
   balance=0.0;
   costPerPage=cppIn;
   }
   
   public PrintQuota(double balIn, double cppIn)
   {
   balance=balIn;
   costPerPage=cppIn;
   }
		
   //methods
   public void setCostPerPage(double costIn)
   {
      costPerPage = costIn;   
   }
   public double getCostPerPage()
   {
      return costPerPage;
   }
   public double getBalance()
   {
      return balance;
   }
   // tops up the balance by amount
   public void topUp(double amount)
   {
      balance += amount; //balance = balance + amount;    
   }
   
   public int calcNoOfPages()
   {
      return (int)(balance / costPerPage);  //note use of cast
   }
   //will print one page
   public void printPage()
   {
      if(balance > costPerPage)  //as long as enough money to print
         balance -= costPerPage; 
   }
   //will print more than one page
   public void printPage(int noOfPages)
   {
      if(balance > (costPerPage  * noOfPages))
         balance -= (costPerPage * noOfPages);
   }

   
}
