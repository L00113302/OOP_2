import java.util.Scanner;
public class P01B4
{

   public static void main (String[] args)
   {
      Scanner keyboardIn = new Scanner (System.in);
      
      // create an integer array with 5 integer elements
      double[] tempArray = new double[7];
      double average=0.00, hottest=tempArray[0], coldest=tempArray[0];
      
      // load the array with values
      for (int i = 0; i < tempArray.length; i++)
      {
         System.out.println("Please enter the temperature for day " +(i+1) +" at noon:");
         tempArray[i] = keyboardIn.nextDouble();
      }  
      
      // display values on screen
      for (int i = 0; i < tempArray.length; i++)
      {
         average = average + tempArray[i] / 7; 
      }
              
      System.out.println ("The average temperature is: " +average);
      
       
      for (int i = 0; i < tempArray.length; i++)
      {
         if (tempArray[i] > hottest)
         {
            hottest = tempArray[i];
         }
      }
      System.out.println ("The hottest day is: " +hottest);
   
         
      for (int i = 0; i < tempArray.length; i++)
      
      { 
      coldest=tempArray[0];  
         if (tempArray[i] < coldest)
         {
            coldest = tempArray[i];
         }
      }  
      System.out.println ("The coldest day is: " +coldest);   
   
   }
}            
