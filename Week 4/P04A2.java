import java.util.Scanner;
public class P04A2
{

   public static void main (String[] args)
   {
      Scanner keyboardIn = new Scanner (System.in);
      {
         String name1 = new String();
         String name2= new String();
         int letters1=0, letters2=0;
      
         System.out.println("Please enter name 1: ");
         name1 = keyboardIn.nextLine();
      
         System.out.println("Please enter name 2: ");
         name2 = keyboardIn.nextLine();
      
         letters1 = name1.length();
         letters2 = name2.length();
      
         if (letters1>letters2)
         {
            System.out.println(name1 +" is the longest String");
         }
         else if (letters2>letters1)
         {
            System.out.println(name2 +" is the longest String. ");
         }
         else
         {
            System.out.println("Both Strings are equal");
         }
      }
   }
}