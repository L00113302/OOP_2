// Oblong tester
// Tester class for Oblong
import java.util.Scanner;
public class OblongTester3
{
   public static void main(String[]args)
   {
   
   Scanner keyboardIn = new Scanner (System.in);
   
   // create an instance of a type Oblong
   Oblong myOblong1 = new Oblong();
   Oblong myOblong2 = new Oblong();
   double h=0, w=0;
   
   System.out.println("Enter the height of the first Oblong: ");
   h = keyboardIn.nextDouble();
     
   System.out.println("Enter the width of the first Oblong: ");
   w = keyboardIn.nextDouble();
   
   myOblong1.setHeight(h);
   myOblong1.setWidth(w); 
   
   myOblong1.calculateArea();

   
   System.out.println("Enter the height of the second Oblong: ");
   h = keyboardIn.nextDouble();
     
   System.out.println("Enter the width of the second Oblong: ");
   w = keyboardIn.nextDouble();

   myOblong2.setHeight(h);
   myOblong2.setWidth(w);
   
   myOblong2.calculateArea();
   
      
   System.out.println("The largest area is the Oblong with: ");
   
   if (myOblong1.calculateArea() > myOblong2.calculateArea())
      {
      System.out.println("Width: " +myOblong1.getWidth() +" and" +" Height: " +myOblong1.getHeight());
      }
      
   else if (myOblong2.calculateArea() > myOblong1.calculateArea())
      {
      System.out.println("Width: " +myOblong2.getWidth() +" and" +" Height: " +myOblong2.getHeight());
      }      
      
   }
}  