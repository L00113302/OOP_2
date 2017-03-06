import java.util.*;
public class P02A4
{

   public static void main (String[] args)
   {
      Scanner keyboardIn = new Scanner (System.in);
      
      // create an integer array with 6 elements
      int[] examArray = new int[6];
      String[] subArray = new String[6];  
      String result=" ";
         
      for (int i = 0; i < examArray.length; i++)
      {  
      System.out.print("Plese enter the exam mark: ");        
      examArray[i] = keyboardIn.nextInt();
      }  
      
          
      for (int i = 0; i < examArray.length; i++)
      {
      System.out.println ("Please enter subject: "); 
      subArray[i] = keyboardIn.nextLine();   
      }

           
      for (int i = 0; i < examArray.length; i++)
      {                
      
         if (examArray[i] >= 40)
         {
            result = "PASS";
         }
         
         else
         {
            result = "FAIL";
         }
      
         {
         System.out.print("Your results are: ");
              
         System.out.println(subArray[i] +"\t"+examArray[i] +"\t" +result);
         }
      }   
   }
}         
      
