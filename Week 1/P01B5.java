import java.util.Scanner;
public class P01B5
{

   public static void main (String[] args)
   {
      Scanner keyboardIn = new Scanner (System.in);
      
      // create an integer array with 5 integer elements
      int[] ageArray = new int[7];
      int  oldest=ageArray[0], students21=21, count=0;
       int youngest=ageArray[0];

           
      // load the array with values
       System.out.println ("Please enter the age of the student:");
      for (int i = 0; i < ageArray.length; i++)
      {              
         System.out.print( "\tAge   " +(i+1) +": ");
         ageArray[i] = keyboardIn.nextInt();
      }  
       System.out.println ("student entered:");
      for (int i = 0; i < ageArray.length; i++)
      {              
         System.out.print( "\tstudent   " +(i+1) +": "+ageArray[i]);
      }  
        
      // display values on screen
      for (int i = 0; i < ageArray.length; i++)
      {
         if (ageArray[i]<youngest)
         {
            youngest=ageArray[i];
            }
      }  
      System.out.println ("The youngest student is: " +youngest);
      
      for (int i = 0; i < ageArray.length; i++)
      {
         if (ageArray[i]>oldest)
         {
            oldest = ageArray[i];
            }
      }
      System.out.println ("The oldest student is: " +oldest);
      
      
      for (int i = 0; i < ageArray.length; i++)
      {
         if(students21 == ageArray[i])
            count++;
      }
      System.out.println ("The number of students aged 21 are: " +count);
       
   
   
   }
}            
