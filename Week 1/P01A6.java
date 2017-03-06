import java.util.Scanner;
public class P01A6
{

   public static void main (String[] args)
   {
      Scanner keyboardIn = new Scanner (System.in);
      
      // create an integer array with 5 integer elements
      double[] tempArray = new double[7];
      double average=0.00;
      
      // load the array with values
      for (int i = 0; i < tempArray.length; i++)
      {
         System.out.println("Please enter the temperature for day " +(i+1) +":");
         tempArray[i] = keyboardIn.nextDouble();
      }  
      
      // display values on screen
      System.out.println ("The temperature is: ");
      for (int i = 0; i < tempArray.length; i++)
      {
         System.out.println ( "\tTemp   " +(i+1) +": " +tempArray[i]);
      
         average = average + tempArray[i] / 7;
      }
         
      {
      
         System.out.println ("The average temperature is: " +average);
      }  
      
   
   
   }
}            
