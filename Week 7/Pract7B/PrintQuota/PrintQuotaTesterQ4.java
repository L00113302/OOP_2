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
public class PrintQuotaTesterQ4
{
   public static void main (String[] args)
   {
      Scanner keyIn = new Scanner(System.in);
      
   	//create PrintQuota object myPrintQuota
      PrintQuota myPrintQuota = new PrintQuota();
      int option, pages;
      double amount; 
      
      //set the inital cost per page
      System.out.print("Enter cost per page:  " );
      amount = keyIn.nextDouble(); 
      myPrintQuota.setCostPerPage(amount);
   
      do{
         System.out.println("\n*********Printing Menu*********");
         System.out.println("1. Get balance\n2. Top up balance\n3. Print:  " );
         System.out.println("4. Show cost per page\n5. Set cost per page  " );
         System.out.println("0. Quit  " );
         System.out.print("Select an option:  " );
         option =  keyIn.nextInt();
      
         switch(option)
         {
            case 1: System.out.println("\nBalance:  " +myPrintQuota.getBalance());
               System.out.println("Amt of Pages left :  " +myPrintQuota.calcNoOfPages());
               break; 
            case 2:  //get top up amount
               System.out.print("How much is top up?  " );
               amount = keyIn.nextDouble(); 
               myPrintQuota.topUp(amount);
            
               break; 
            case 3:  //get no of pages to print
               System.out.print("How many pages?  " );
               pages = keyIn.nextInt(); 
                  //check if enough money to print
               if(myPrintQuota.calcNoOfPages() > pages )
                  myPrintQuota.printPage(pages);  //go ahead and print them 
               else
                  System.out.println("insufficient balance- you can only print " +myPrintQuota.calcNoOfPages() +" pages" );
            
               break; 
            case 4:  //display cost per page                  
               System.out.println("cost to Print a page:  " +myPrintQuota.getCostPerPage() );
            
               break; 
            case 5:  //set cost per page
               System.out.print("Enter cost per page:  " );
               amount = keyIn.nextDouble(); 
               myPrintQuota.setCostPerPage(amount);
            case 0:  //quit                 
                  
               break;  
            default:  //display cost per page                  
               System.out.println("Invalid option selected..   " );
            
               break; 
         
         }//end switch
      }while(option != 0);
      
      System.out.println("Balance:  " +myPrintQuota.getBalance());
      System.out.println("cost /page:  " +myPrintQuota.getCostPerPage());
      System.out.println("Amt of Pages left :  " +myPrintQuota.calcNoOfPages());
   
   
   }
}
