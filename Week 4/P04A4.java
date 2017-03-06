import java.util.Scanner;
public class P04A4
{

   public static void main (String[] args)
   {
      Scanner keyboardIn = new Scanner (System.in);
      {
         String name = new String();
         int letters=0;
         char first=' ', last =' ';         
      
         System.out.println("Please enter the String: ");
         name = keyboardIn.nextLine();
         
         letters = name.length();
         
         first = name.charAt(0);
         System.out.println("First letter: "+first);
         
         last = name.charAt(letters-1);
         System.out.println("Last letter: "+last);
            
      }
   }
}