import java.util.*;
public class revision
{

   public static void main (String[] args)
   {
      Scanner keyboardIn = new Scanner (System.in);
     
      int[]dayArray=new int[] {30,31,28,30,30,31,30,31,30,29,30,31};
      int month=0;
      
      do
      {
       System.out.println("Please enter the month: ");
       month=keyboardIn.nextInt();
         
    
      System.out.println(dayArray[month-1]);
      }while(month != -1);
      
    }
}      
      
   
      