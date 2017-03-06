import java.util.Scanner;
public class P04A3
{

   public static void main (String[] args)
   {
      Scanner keyboardIn = new Scanner (System.in);
      {
         String name = new String();        
      
         System.out.println("Please enter the String: ");
         name = keyboardIn.nextLine();
         
         name = name.toUpperCase();
         System.out.println(name);
         
         name = name.toLowerCase();
         System.out.println(name);
      }
   }
}