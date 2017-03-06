import java.util.Scanner;
public class P01B3
{

   public static void main (String[] args)
   {
   Scanner keyboardIn = new Scanner (System.in);

      
      // create an integer array with 6 lotto numbers
      int[] lottoArray = new int[] {8,12,18,22,29,34};
      int searchValue;
      int position = -1;
      
   
      
      // ask user for value
      System.out.println ("Enter then lotto number your searching for: ");
      searchValue = keyboardIn.nextInt();
      
      
      for (int i = 0; i < lottoArray.length; i++)
      {
      if (lottoArray[i] == searchValue)
         {
         position = i;
         }
      }
      
      if (position != -1)
       System.out.print ("Lotto number found at position: " +(position+1));
       
      else
       System.out.print ("Value not found!");   
         
      }  
      
}           
  