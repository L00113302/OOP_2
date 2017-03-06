import java.util.Scanner;
public class P01B2
{

   public static void main (String[] args)
   {
      Scanner keyboardIn = new Scanner (System.in);
      
      // create an integer array with 5 string elements
      String[] studentArray = new String[]{"James", "Michael", "John", "Matthew", "Rory"};
      
     
      
      // display values on screen
      for (int i = studentArray.length-1; i >= 0; i--)
      {
         
         System.out.println (studentArray[i]);
      }
    }
}            
