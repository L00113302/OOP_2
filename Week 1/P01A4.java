import java.util.Scanner;
public class P01A4
{

   public static void main (String[] args)
   {
      
      // create an integer array with 6 lotto numbers
      int[] lottoArray = new int[] {8,12,18,22,29,34};
      
   
      
      // display values on screen
      System.out.println ("Lotto numbers are: ");
      for (int i = 0; i < lottoArray.length; i++)
      {
         System.out.println ( "\tNumber   " +(i+1) +": " +lottoArray[i]);
         
      }  
      


   }
}            
  