import java.util.*;
public class PO1C4
{

   public static void main (String[] args)
   {
      Scanner keyboardIn = new Scanner (System.in);
      Random noGenerator = new Random();
   
    
      int[] randArray = new int[10];
      int randomNumber;
      randomNumber = noGenerator.nextInt(30);
      
           
      // load the array with values
      for (int i = 0; i < randArray.length; i++)
      {
         randArray[i] = noGenerator.nextInt();
      }
      
      for (int j = 0; j< randArray.length; j++)
      {
      System.out.println ("The number is: " +randomNumber);
      }
   }
}      
