import java.util.Scanner;
public class P04C1
{

   public static void main (String[] args)
   {
      Scanner keyboardIn = new Scanner (System.in);
      {
         String string = new String();
     
       
              
         System.out.println("Please enter the String: ");
         string = keyboardIn.nextLine();
      
         
            for(int j = string.length()-1; j>=0; j--)
            {
            System.out.print(string.charAt(j));
            }             
         
      }
   }
}         
