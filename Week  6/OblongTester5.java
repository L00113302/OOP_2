// Oblong tester
// Tester class for Oblong
import java.util.Scanner;
public class OblongTester5
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
   myOblong.isSquare();
   
      
   if (myOblong.isSquare())
   {
   System.out.println("That is a square.");
   }
   else
   {
   System.out.println("That is not a square.");
   }
   
   }
}  