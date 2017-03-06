import java.util.Scanner;
public class P011A
{

   public static void main (String[] args)
   {
      Scanner keyboardIn = new Scanner (System.in);
      
      // create an integer array with 5 integer elements
      int[] myArray = new int[5];
      
      // load the array with values
      System.out.print ("Enter 5 integer values: ");
      for (int i = 0; i < myArray.length; i++)
      {
         System.out.print ( "\tNumber   " +(i+1) +": ");
         myArray[i] = keyboardIn.nextInt();
      }  
   }
}            
  