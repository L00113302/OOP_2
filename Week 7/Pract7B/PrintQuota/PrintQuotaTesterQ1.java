/*
	Written by : Maeve Carr
	Date:
	Desc:	A program that will .....
	FileName: 
*/


import java.util.Scanner;
/**
   This is a simple tester class for PrintQuota class.
*/
public class PrintQuotaTesterQ1
{
   public static void main (String[] args)
   {
      Scanner keyIn = new Scanner(System.in);
      
		//create PrintQuota object myPrintQuota
		PrintQuota myPrintQuota = new PrintQuota();

		System.out.println("After creating ");
      System.out.println("Balance:  " +myPrintQuota.getBalance());
		System.out.println("cost /page:  " +myPrintQuota.getCostPerPage());

      //set cost per page
      myPrintQuota.setCostPerPage(0.10);
		//top up balance
      myPrintQuota.topUp(10.0);
      
      System.out.println("\n\nAfter topup and setting cost ");
      System.out.println("Balance:  " +myPrintQuota.getBalance());
		System.out.println("cost /page:  " +myPrintQuota.getCostPerPage());

      System.out.println("Amt of Pages printable :  " +myPrintQuota.calcNoOfPages());

      //print a single page
      myPrintQuota.printPage();
      myPrintQuota.printPage();


      //
      System.out.println("\n\nAfter topup and setting cost ");
      System.out.println("Balance:  " +myPrintQuota.getBalance());
		System.out.println("cost /page:  " +myPrintQuota.getCostPerPage());

      System.out.println("Amt of Pages printable :  " +myPrintQuota.calcNoOfPages());

      System.out.println("How many pages do you want to print :  " );
      int pages = keyIn.nextInt(); 
      
      if(myPrintQuota.getBalance() > pages * myPrintQuota.getCostPerPage())
         myPrintQuota.printPage(pages);
      else
         System.out.println("insufficient balance- you can only print " +myPrintQuota.calcNoOfPages() +" pages" );


      System.out.println("\n\nAfter printing lots ");
      System.out.println("Balance:  " +myPrintQuota.getBalance());
		System.out.println("cost /page:  " +myPrintQuota.getCostPerPage());

      System.out.println("Amt of Pages printable :  " +myPrintQuota.calcNoOfPages());



	}
}
