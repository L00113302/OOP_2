import java.util.Scanner;
public class P01B6
{

   public static void main (String[] args)
   {
      Scanner keyboardIn = new Scanner (System.in);
      
      // create an integer array with 12 integers
      int[] rainArray = new int[] {71, 69, 59, 57, 56, 65, 76, 75, 65, 64, 78, 70};
      int  less60=rainArray[0], more70=rainArray[0], count=0;
      
   
      // display values on screen
      for (int i = 0; i < rainArray.length; i++)
      {
         if (rainArray[i]<=60)
         count++;
      }  
      System.out.println ("The number of months rainfall was less than 60mm is: " +count);
      
      for (int i = 0; i < rainArray.length; i++)
      {
         if (rainArray[i]>=70)
            count++;
      }
      System.out.println ("The number of months rainfall was more than 70mm is: " +count);
   
   }
}            
