import java.util.Scanner;
public class P04B4
{

   public static void main (String[] args)
   {
      Scanner keyboardIn = new Scanner (System.in);
      {
         String string1 = new String();
         String string2 = new String();
       
              
         System.out.println("Please enter the first String: ");
         string1 = keyboardIn.nextLine();
      
         System.out.println("Please enter the second String: ");
         string2 = keyboardIn.nextLine();
                  
         if (string1.contains(string2))
         
            System.out.println("The first string contains the second string"); 
         
         else 
         
            System.out.println("The first string does not contain the second string.");       
         
      }
   }
}         
