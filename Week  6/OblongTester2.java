// Oblong tester
// Tester class for Oblong
import java.util.Scanner;
public class OblongTester2
{
   public static void main(String[]args)
   {
   
   Scanner keyboardIn = new Scanner (System.in);
   
   // create an instance of a type Oblong
   Oblong myOblong = new Oblong();
   double height=0, width=0;
   
   System.out.println("Enter the height: ");
   height = keyboardIn.nextDouble();
     
   System.out.println("Enter the width: ");
   width = keyboardIn.nextDouble();
   
   myOblong.setHeight(height);
   myOblong.setWidth(width); 
   
      
   // use methods to retrieve values of instance variables
   System.out.println("Area: " +myOblong.calculateArea());
   
   }
}  