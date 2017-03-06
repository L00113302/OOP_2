import java.util.Scanner;
import java.awt.Rectangle;
public class P05A6
{

   public static void main (String[] args)
   {
      Scanner keyboardIn = new Scanner (System.in);
        
      Rectangle r = new Rectangle();
      int height=0, width=0;
      int x=0, y=0;
          
      System.out.println("Enter the X coordinate: ");
      x = keyboardIn.nextInt();
     
      System.out.println("Enter the Y coordinate: ");
      y = keyboardIn.nextInt();
     
   
     
      r.setSize(20,10);
      r.setLocation(x, y);
      r.contains(x,y);
      
      if (r.contains(x,y))
      {
         System.out.print("The rectangle does contain the point "+r.getLocation());
      }
      else
      {
         System.out.print("Invalid entry.");
      }
   }
}    
