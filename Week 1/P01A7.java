import java.util.Scanner;
public class P01A7
{

   public static void main (String[] args)
   {
      Scanner keyboardIn = new Scanner (System.in);
      
      // create an integer array with 5 integer elements
      int[] ageArray = new int[8];
      int newAge=0;
      
      System.out.println ("Please enter the age of the students");
      
      // load the array with values
      for (int i = 0; i < ageArray.length; i++)
        {
         System.out.print( "\tAge   " +(i+1) +": ");
         ageArray[i] = keyboardIn.nextInt();
        }  
      
      // display values on screen
      for (int i = 0; i < ageArray.length; i++)
      {
         
         System.out.println ( "\tAge   " +(i+1) +": " +ageArray[i]);
         newAge = ageArray[i] + 5;
      
         System.out.println ("The age in 5 years time is: " +newAge);
      }  
      


   }
}            
