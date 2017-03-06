// Oblong tester
// Tester class for Oblong
import java.util.Scanner;
public class OblongTester6
{
   public static void main(String[]args)
   {
   
   Scanner keyboardIn = new Scanner (System.in);
   
   // create an instance of a type Oblong
   Oblong myOblong = new Oblong();
   double height=0, width=0, newH=0, newW=0;
   
   System.out.println("Enter the height: ");
   height = keyboardIn.nextDouble();
     
   System.out.println("Enter the width: ");
   width = keyboardIn.nextDouble();
   
   myOblong.setHeight(height);
   myOblong.setWidth(width); 
   
   System.out.println("Enter increase in height: ");
   newH=keyboardIn.nextDouble();    
   
   System.out.println("Enter increase in width: ");
   newW=keyboardIn.nextDouble90;
   
     
   }
}  