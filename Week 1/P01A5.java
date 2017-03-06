import java.util.Scanner;
public class P01A5
{

   public static void main (String[] args)
   {
      Scanner keyboardIn = new Scanner (System.in);
      
      // create an integer array with 5 integer elements
      double[] priceArray = new double[10];
      double total=0.00;
      
      // load the array with values
      System.out.println ("Enter 10 prices: ");
      for (int i = 0; i < priceArray.length; i++)
        {
         System.out.print( "\tNumber   " +(i+1) +": ");
         priceArray[i] = keyboardIn.nextDouble();
        }  
      
      // display values on screen
      System.out.println ("The price is: ");
      for (int i = 0; i < priceArray.length; i++)
      {
         
         System.out.println ( "\tNumber   " +(i+1) +": " +priceArray[i]);
         total = total + priceArray[i];
      }
         
      {
      
         System.out.println ("The total is: " +total);
      }  
      


   }
}            
  