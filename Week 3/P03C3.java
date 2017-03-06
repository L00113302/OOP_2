import java.util.Scanner;
public class P03C3
{

   public static void main (String[] args)
   {
      Scanner keyboardIn = new Scanner (System.in);
      
      // create an integer array with 5 integer elements
      int[] lottoArray = {39, 1, 33, 3, 36, 6};
      int temp=0;
      
      System.out.print("Lotto Numbers:");
       
      for (int i = 0; i < lottoArray.length; i++)
      {               
         System.out.print(+lottoArray[i] +" ");
      }  
           
      for (int i = 0; i < lottoArray.length; i++)
      {
         for (int j=0; j<lottoArray.length-1; j++)
         {
            if (lottoArray[j] > lottoArray[j+1])
            {
            temp = lottoArray[j];
            lottoArray[j] = lottoArray[j+1];
            lottoArray[j+1] = temp;
            }
         }  
      }      
      System.out.print ("Results in Numerical Order: "); 
     for (int i = 0; i < lottoArray.length; i++)
      {
         System.out.print(+lottoArray[i] +" ");
      }  
    
   }
}         
      
