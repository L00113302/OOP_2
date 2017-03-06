import java.util.Scanner;
import java.awt.Rectangle;
public class P05A1
{

   public static void main (String[] args)
   {
            
      Rectangle r = new Rectangle();
      int height=0, width=0;
      int x=0, y=0;
     
      r.setSize(20,10);
      r.setLocation(15,35);
     
      System.out.println("The x coordinate is: "+r.getX());
      System.out.println("The y coordinate is: "+r.getY());
      System.out.println("The height is: "+r.getHeight());
      System.out.println("The width is:  "+r.getWidth()); 
   }
}         
      
