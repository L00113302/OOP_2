// Circle tester
// Tester class for Circle
import java.util.Scanner;

public class CircleTester
{
   public static void main(String[]args)
   {
   
      Scanner keyboardIn = new Scanner (System.in);
   
      Circle myCircle = new Circle();
      double radius=0.00;
      
      System.out.println("Enter the radius: ");
      radius=keyboardIn.nextDouble();
      
      myCircle.setRadius(radius);

      System.out.println("The area of ther circle is: " +myCircle.calcArea());
      
      System.out.println("The circumference of the circle is: "+myCircle.calcCircum());
      
   }
}      