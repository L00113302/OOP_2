import java.util.Scanner;
public class P04C2
{

   public static void main (String[] args)
   {
      Scanner keyboardIn = new Scanner (System.in);
      {
         String string = new String();
         boolean palindrome = true;
         
         string = "ant";
         // test to see if its a palindrome
         for(int i=0; i<string.length(); i++)
         {
            if(string.charAt(i) == string.charAt((string.length() -i -1)))
            {
               System.out.println(string.charAt(i) + " = " +string.charAt(string.length() -i -1));
            }
            else
            {
               System.out.println(string.charAt(i) +" NOT + " +string.charAt(i) +(string.length()-i-1));
               palindrome = false;
            }
         }
         
         if(palindrome)
         {
            System.out.println(string+ " is a palindrome.");
         }
         else
         {
            System.out.println(string+ " is not a palindrome. "); 
         }
}
}
}         
       