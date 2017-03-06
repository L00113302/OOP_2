import java.util.Scanner;
import java.awt.Rectangle;
public class P05A5
{

   public static void main (String[] args)
   {
      Scanner keyboardIn = new Scanner (System.in);
        
      Rectangle r = new Rectangle();
      int height=0, width=0;
      int x=0, y=0;
     
      System.out.println("Enter the height: ");
      height = keyboardIn.nextInt();
     
      System.out.println("Enter the width: ");
      width = keyboardIn.nextInt();
     
      System.out.println("Enter the X coordinate: ");
      x = keyboardIn.nextInt();
     
      System.out.println("Enter the Y coordinate: ");
      y = keyboardIn.nextInt();
     
   
     
      r.setSize(width, height);
      r.setLocation(x, y);
      r.grow(10, 25);
   
      System.out.println(r.toString());     
   }
}    
