import java.util.Scanner;
public class P04A6
{

   public static void main (String[] args)
   {
      Scanner keyboardIn = new Scanner (System.in);
      {
         String name = new String();
         char first1=' ', first2=' ';
         int space=0;
      
         System.out.println("Please enter name separated by a space: ");
         name = keyboardIn.nextLine();
         first1 = name.charAt(0);
      
         space = name.indexOf(" ");
      
        
         first2 = name.charAt(space+1);
         
         System.out.println("Intials: " +first1 +first2);
         
      }
   }
}         
