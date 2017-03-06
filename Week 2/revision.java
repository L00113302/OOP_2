import java.util.*;
public class revision
{

   public static void main (String[] args)
   {
      Scanner keyboardIn = new Scanner (System.in);
      
      // create an integer array with 6 elements
      int[]array1=new int[5];
      int[]array2=new int[5];
      
      //read values into array1 
      System.out.println("Please enter 5 numbers: ");
      
      for(int i=0; i<array1.length; i++)
      {
      System.out.println("Number " +(i+1) +": ");
      array1[i]=keyboardIn.nextInt();
      }
      
      System.out.println("Please enter 5 numbers: ");
      
      for(int i=0; i<array2.length; i++)
      {
      System.out.println("Number "+(i+1)+": ");
      array2[i]=keyboardIn.nextInt();
      }

      for(int i=0; i<array1.length; i++)
      {
      System.out.println(array1[i]*array2[i] +" ");
      }
      
    }
}      
      
   
      