import java.util.*;
public class P02A6
{

   public static void main (String[] args)
   {
      Scanner keyboardIn = new Scanner (System.in);
      
      // create an integer array with 8 integer elements
      int[] qtyInStock = new int[8];
      double[] unitPrice = new double[8];
      double[] stockValue = new double[8];
      int reorder = 0;
      
      for (int i = 0; i < qtyInStock.length; i++)
      {  
      System.out.print("Please enter the quantity in stock: ");            
      qtyInStock[i] = keyboardIn.nextInt();
      }  

   
      for (int i = 0; i < unitPrice.length; i++)
      {              
      System.out.println("Please enter the unit price: "); 
      unitPrice[i] = keyboardIn.nextDouble();
      }
      
      for (int i = 0; i < stockValue.length; i++)  
      {
      System.out.println ("Stock Value: " +qtyInStock[i] * unitPrice[i]);
      } 
      
      System.out.println ("Please enter reorder level: ");
      reorder = keyboardIn.nextInt();
      
      
       for (int i = 0; i < qtyInStock.length; i++)
     {
      if (reorder > qtyInStock[i])
      {
      System.out.println("Item Number "+qtyInStock[i] +" needs to be reordered!");
      }
      }  
      
      
            
   }
}         
      
