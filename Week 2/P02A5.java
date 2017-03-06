import java.util.*;
public class P02A5
{

   public static void main (String[] args)
   {
      Scanner keyboardIn = new Scanner (System.in);
      
      // create an integer array with 6 elements
      int[] homeArray = new int[6];
      int[] awayArray = new int[6];
      int[] resultArray = new int[6];
      int winCount=0, loseCount=0, drawCount=0;
         
      for (int i = 0; i < homeArray.length; i++)
      {  
      System.out.print("Plese enter the home score: ");        
      homeArray[i] = keyboardIn.nextInt();
      }  
      
      for (int i = 0; i < awayArray.length; i++)   
      {
      System.out.println ("Please enter the away score: "); 
      awayArray[i] = keyboardIn.nextInt();   
      }

       for (int i = 0; i < resultArray.length; i++)
       {
              
      
         if (homeArray[i] > awayArray[i])
         {
         winCount++;
         }
         
         else if (awayArray[i] > homeArray[i])
         {
         loseCount++;
         }
         
         else
         {
         drawCount++;
         }
       }  
         {
         System.out.println("Your results are: ");
         System.out.println("Won" +"\t" +"Lost" +"\t" +"Drawn");
         }
         {     
         System.out.println(winCount +"\t"+loseCount +"\t" +drawCount);
         }
         
   }
}         
      
