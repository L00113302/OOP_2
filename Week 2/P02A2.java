import java.util.Scanner;
public class P02A2
{

   public static void main (String[] args)
   {
      Scanner keyboardIn = new Scanner (System.in);
      
      // create an integer array with 5 integer elements
      
      int[] dayArray = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
      int month=0;
      
      do
      {
      
      System.out.println ("Please enter the month 1-12:");
      month = keyboardIn.nextInt();
      
      
      // display values on screen
      System.out.println("Month "+ month +" has " +dayArray[month-1] +" days");
      }while (month != -1);
      {
      System.out.print ("Invalid Entry");
      } 
   }
}          
