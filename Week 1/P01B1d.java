import java.util.Scanner;
public class P01B1d
{

   public static void main (String[] args)
   {
      Scanner keyboardIn = new Scanner (System.in);
      
      // create an integer array with 5 integer elements
      int[] scoreArray = new int[5];
      
      System.out.println ("Please enter the five highest scores");
      
      // load the array with values
      for (int i = 0; i < scoreArray.length; i++)
        {
         System.out.print( "Score   " +(i+1) +": ");
         scoreArray[i] = keyboardIn.nextInt();
        }  
      
      // display values on screen
      for (int i = scoreArray.length-1; i >= 0; i--)
      {
         
         System.out.print (+scoreArray[i] +" ");
      }
    }
}            
