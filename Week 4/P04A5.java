import java.util.Scanner;
public class P04A5
{

   public static void main (String[] args)
   {
      Scanner keyboardIn = new Scanner (System.in);
      
         String password = new String();
         
         System.out.println("Please enter the password: ");
         password = keyboardIn.nextLine();
            
            if (password.equalsIgnoreCase("let me in"))
            {
            System.out.println ("Password Correct.");
            }
            else
            {
            System.out.print ("Password Incorrect!");
            }
         
   }
}         
         
         
    