import java.util.Scanner;
public class P04A1
{

   public static void main (String[] args)
   {
      Scanner keyboardIn = new Scanner (System.in);
      {
         String name = new String();
         int letters=0;
      
         System.out.println("Please enter the name: ");
         name = keyboardIn.nextLine();
      
         letters = name.length();
      
         System.out.println(+letters-1 +" characters. ");
      }
   }
}