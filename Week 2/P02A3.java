import java.util.*;
public class P02A3
{

   public static void main (String[] args)
   {
      Scanner keyboardIn = new Scanner (System.in);
      
      // create an integer array with 5 integer elements
      int[] examArray = new int[6];
      String result=" ";
      
      for (int i = 0; i < examArray.length; i++)
      {  
      System.out.print("Please enter the exam mark: ");            
      examArray[i] = keyboardIn.nextInt();
      }  

   
      for (int i = 0; i < examArray.length; i++)
      {              
         System.out.println( "Result " +(i+1) +": " +result);  
      
         if (examArray[i] >= 40)
         {
            result = "PASS";
         }
         
         else
         {
            result = "FAIL";
         }
      }
      
   }
}         
      
