import java.util.*;
public class PO3C2
{

   public static void main (String[] args)
   {
      Scanner keyboardIn = new Scanner (System.in);
      Random noGenerator = new Random();
   
      int[] randArray = new int[10];
      int randomNumber;
      randomNumber = noGenerator.nextInt(30);
      
           
         for (int i = 0; i < randArray.length; i++)
         {
         randArray[i] = noGenerator.nextInt();
            {
            System.out.println ("The number is: " +randomNumber);
            }
         }   
      
   }
}      
