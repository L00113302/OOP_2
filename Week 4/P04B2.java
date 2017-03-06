import java.util.Scanner;
public class P04B2
{

   public static void main (String[] args)
   {
      Scanner keyboardIn = new Scanner (System.in);
      {
         String password1 = new String();
         String password2 = new String();
       
              
         System.out.println("Please enter the password: ");
         password1 = keyboardIn.nextLine();
      
         System.out.println("Please re-enter the password: ");
         password2 = keyboardIn.nextLine();
                  
        
         boolean answer = password1.equals(password2);
         System.out.println(answer);        
         
      }
   }
}         
