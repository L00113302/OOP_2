import java.util.Scanner;
import java.awt.Rectangle;
public class P05A3
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
     
      System.out.println("The x coordinate is: "+r.getX());
      System.out.println("The y coordinate is: "+r.getY());
      System.out.println("The height is: "+r.getHeight());
      System.out.println("The width is:  "+r.getWidth()); 
      System.out.println("The area is: "+(r.getHeight() * r.getWidth()));
      System.out.println("The perimeter is: "+(r.getHeight()+r.getHeight()+r.getWidth()+r.getWidth()));
   }
}         
      
