import java.util.*;
public class P03A1
{

   public static void main (String[] args)
   {
      Scanner keyboardIn = new Scanner (System.in);
      
      final int ROWS = 3;
      final int COLS = 4;
      int[][] my2dArray = new int[ROWS][COLS];
      int[]rowArray = new int[3];
      int[]colArray = new int[4];
                   
      for (int r = 0; r < 3; r++)
      { 
         for(int c=0; c<4; c++)
         {
            System.out.println("Enter the value for row " +(r+1) +" column " +(c+1) +":");
            my2dArray[r][c]=keyboardIn.nextInt();
         }   
      }  
      
      System.out.println ("Array: ");
      
      for(int r=0; r< ROWS; r++)
      {
         for(int c=0; c< COLS; c++)
         {
            System.out.print(my2dArray[r][c] +"\t");
         }
         System.out.println();
      } 
      
      for(int r=0; r<rowArray.length; r++)
      {
         for(int c=0; c<colArray.length; c++)
         {
         rowArray[r]=rowArray[r]+my2dArray[r][c];
         }
      System.out.println("Total for Row " +(r+1) +":" +rowArray[r]);     
      }
      
      for(int c=0; c<colArray.length; c++)
      {
         for(int r=0; r<rowArray.length; r++)
         {
         colArray[c]=colArray[c]+my2dArray[r][c];
         }
      System.out.println("Total for Column " +(c+1) +":" +colArray[c]);
      } 
         
   }
}         
      
