import java.util.Scanner;
public class P04B5
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
         
         if (string1.endsWith(string2))
         
         System.out.print ("The first string ends with the second string");
         
         else if(string1.startsWith(string2))
         
         System.out.print ("The first string starts with the second string");       
         
      }
   }
}         
