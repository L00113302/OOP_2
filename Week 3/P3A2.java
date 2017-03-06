// magic square question - building on P3AQ1

public class P3A2
{
   public static void main(String [] args)
   {

   // declare array
   int [][] my2dArray = {
                         {8, 1, 6},
                         {3, 5, 7},
                         {4, 9, 2}
                        }; 
   int[] rowTotals = new int[3];
   int[] colTotals = new int[3];
   int diagonalTotal1 = 0;
   int diagonalTotal2 = 0;
   int total = 0;
   
   
   
   // print out contents
   
   // for each row
   for(int r = 0; r < my2dArray.length; r++)
   {
      // for each column in that row
      for(int c = 0; c < my2dArray[0].length; c++)
      {
         System.out.print(my2dArray[r][c] + "\t");
      }
      System.out.println();
   }
   
   
   // total each row - use the same nested for loop 
   // as when printing, as that runs through the array
   // row by row.  Add the current item in each row to a
   // running total, then copy that to another array
     
   // for each row
   for(int r = 0; r < my2dArray.length; r++)
   {
      // for each column in that row
      for(int c = 0; c < my2dArray[0].length; c++)
      {
         // add to running total
         total = total + my2dArray[r][c];
      }
      // copy total to the rowTotals array
      rowTotals[r] = total;
      // reset total for the start of the next row
      total = 0;
   }
   
   
   // total each column - reverse the order of the for loops 
   // so you run through the array column by column. 
   // Add the current item in each column to a
   // running total, then copy that to another array
     
   // for each column
   for(int c = 0; c < my2dArray[0].length; c++)
   {
      // for each row in that column
      for(int r = 0; r < my2dArray.length; r++)
      {
         // add to running total
         total = total + my2dArray[r][c];
      }
      // copy total to the colTotals array
      colTotals[c] = total;
      // reset total for the start of the next column
      total = 0;
   }
   
   
   // get diagonal total1
   // a square is in the  first diagonal if its 
   // row and column number is the same e.g. [0][0]
      
   // for each row
   for(int r = 0; r < my2dArray.length; r++)
   {
      // for each column in that row
      for(int c = 0; c < my2dArray[0].length; c++)
      {
         // add to running total if cols the same
         if(r==c)
            diagonalTotal1 = diagonalTotal1 + my2dArray[r][c];
      }
    }
    System.out.println("Diagonal 1 : " + diagonalTotal1);
    
    
    // get diagonal total2
   // a square is in the second diagonal if its 
   // row and column number add up to 2 e.g. [0][2]
      
   // for each row
   for(int r = 0; r < my2dArray.length; r++)
   {
      // for each column in that row
      for(int c = 0; c < my2dArray[0].length; c++)
      {
         // add to running total if cols the same
         if((r+c) == 2)
            diagonalTotal2 = diagonalTotal2 + my2dArray[r][c];
      }
    }
    System.out.println("Diagonal 2 : " + diagonalTotal2);
    
    
   

   
   // print out row totals
   for(int i = 0; i < rowTotals.length; i++)
   {
      System.out.println("Total for row " + (i+1) + " = " + rowTotals[i]) ;
   }
   
   // print out column totals
   for(int i = 0; i < colTotals.length; i++)
   {
      System.out.println("Total for columnn " + (i+1) + " = " + colTotals[i]) ;
   }
   
   // check to see if they are all equal
   if(diagonalTotal1 == diagonalTotal2 && diagonalTotal1 == rowTotals[0] && diagonalTotal1 == rowTotals[1] 
   && diagonalTotal1 == rowTotals[2] && diagonalTotal1 == colTotals[0] && diagonalTotal1 == colTotals[1]
   && diagonalTotal1 == colTotals[2])
   {
      System.out.println("This is a magic square");
   }
   else
   {
      System.out.println("This is not a magic square");
   }
   
   
   }
}