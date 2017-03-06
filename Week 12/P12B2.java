import java.util.Scanner;
public class P12B2
{

   public static void main (String[] args)
   {
      Scanner keyboardIn = new Scanner (System.in);
      
      // create an integer array with 12 integers
      String[] staffArray = new String[6];
      int[] salesArray = new int[6];
      int count1=0, count2=0, average=0;
      int highest=salesArray[0];
      String nameL=" ", nameH=" ";
      
   
      for (int i = 0; i < staffArray.length; i++)
      {  
         System.out.print("Plese enter the staff name: ");        
         staffArray[i] = keyboardIn.nextLine();
      }  
      
          
      for (int i = 0; i < salesArray.length; i++)
      {
         System.out.println ("Please enter sales: "); 
         salesArray[i] = keyboardIn.nextInt(); 
      
         if(salesArray[i]>=50)
            count1++;
         else
            count2++; 
      }
      
      System.out.println("Sales for this month: ");
       
      for (int i = 0; i < staffArray.length; i++)
      {
         System.out.println(staffArray[i] +"\t" +salesArray[i]);
      }
       
      System.out.println("Number who reached target sales: " +count1);
      System.out.println("Number who failed to reach target: " +count2);
       
      for (int i = 0; i < salesArray.length; i++)
      {
         int lowest=salesArray[0];
      
         if (salesArray[i]<lowest)
         {
            lowest=salesArray[i];
            nameL=staffArray[i];
         }
        
      } 
      System.out.println("Staff member with the lowest sales: " +nameL);  
      
      for (int i = 0; i < salesArray.length; i++)
      {
         if (salesArray[i]>highest)
         {
            highest=salesArray[i];
            nameH=staffArray[i];
         }
      } 
      System.out.println("Staff member with the highest sales: " +nameH);   
   
       
      for (int i = 0; i < salesArray.length; i++)
      {
         average = average+salesArray[i]/6;
        
      } 
   
      System.out.println("Average sales: " +average); 
   
   
   }
}