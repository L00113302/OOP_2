import java.util.Scanner;
public class P02A1
{

   public static void main (String[] args)
   {
      Scanner keyboardIn = new Scanner (System.in);
      
      // create an integer array with 5 integer elements
      int[] numArray1 = new int[10];
      int[] numArray2 = new int[10];
      int[] numArray3 = new int[10];
      int  total=0;

           
      // load the array with values
       System.out.println ("Please enter the number:");
      for (int i = 0; i < numArray1.length; i++)
      {              
         System.out.print( "Num " +(i+1) +": ");
         numArray1[i] = keyboardIn.nextInt();
      }  
      
      for (int i = 0; i < numArray1.length; i++)
      {              
      total = total+numArray1[i];
      }  
      System.out.println("The total is: " +total);
        
      // display values on screen
      for (int i = 0; i < numArray2.length; i++)
      {
         numArray2[i] = numArray1[i];
      
       System.out.println ( "Num " +(i+1) +": " +numArray2[i]);
      }
      int j=0;
       for (int i = numArray1.length-1; i >= 0; i--)
      {
       numArray3[j] =numArray1[i];
       j++;
   
      
       System.out.println ( "Num " +(i+1) +": " +numArray3[i]);
       }
       
   
   
   }
}            
