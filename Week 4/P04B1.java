import java.util.Scanner;
public class P04B1
{

   public static void main (String[] args)
   {
      Scanner keyboardIn = new Scanner (System.in);
      {
         String place = new String();
         
         System.out.print("Please enter the word: ");
         place = keyboardIn.nextLine();
         
         String place2 = place.replace('i','x');
         System.out.println(place2);         
         
      }
   }
}         
