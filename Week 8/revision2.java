import java.util.*;
public class revision2
{

   public static void main (String[] args)
   {
      Scanner keyboardIn = new Scanner (System.in);
     
      int[] markArray=new int[6];
      String[] titleArray=new String[6];
      String result=" ";
      
      System.out.println("Enter six subjects: ");
      
      for(int i=0; i<titleArray.length; i++)
      {
         System.out.println("Subject " +(i+1) +": ");
         titleArray[i]=keyboardIn.nextLine();
      }
         
      System.out.println("Enter six marks: ");
      
      for(int i=0; i<markArray.length; i++)
      {
         System.out.println("Mark " +(i+1) +": ");
         markArray[i]=keyboardIn.nextInt();   
      }
      
      System.out.println("Your results are: ");
      for(int i=0; i<markArray.length; i++)
      {
         if(markArray[i]<40)
         {
            result="FAIL";
         }
         
         else if(markArray[i]>=40)
         {
            result="PASS";
         }
      
      
         System.out.println(titleArray[i] +"\t\t" +markArray[i] +"\t\t" +result);
      }
   
   }
}