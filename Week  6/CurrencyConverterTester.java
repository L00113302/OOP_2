// Currency Convert tester
// Tester class for Currency Convert
import java.util.Scanner;

public class CurrencyConverterTester
{
   public static void main(String[]args)
   {
   
      Scanner keyboardIn = new Scanner (System.in);

      CurrencyConverter myConvert = new CurrencyConverter();
      int option=0;
      double todaysRate=0.00, amount=0.00;
      
      System.out.println("******Curreny Converter*******");
      System.out.println(" 1. Euro to Sterling.");
      System.out.println(" 2. Sterling to Euro.");
      System.out.println(" 3. Quit. ");
      System.out.println();
      
      do
      {
         System.out.println("Enter exchange rate: ");
         todaysRate=keyboardIn.nextDouble();
         myConvert.setRate(todaysRate);
         
         System.out.println("Please enter an option: ");
         option = keyboardIn.nextInt();
         
         switch(option)
         {
         case 1: 
         System.out.println("Enter the amount to convert:");  
         amount=keyboardIn.nextDouble();
         myConvert.convertToSterling(amount);
         System.out.println("Amount in sterling: " +myConvert.convertToSterling(amount));
         break;
         
         case 2: 
         System.out.println("Enter the amount to convert:");  
         amount=keyboardIn.nextDouble();
         myConvert.convertToEuro(amount);
         System.out.println("Amount in Euro: " +myConvert.convertToEuro(amount));
         break;
         }
         
      }while(option!=3);   

   
        
   }
}   