import java.util.Scanner;
public class P04B3
{

   public static void main (String[] args)
   {
      Scanner keyboardIn = new Scanner (System.in);
      {
         String name1 = new String();
         String name2 = new String();
       
              
         System.out.println("Please enter the first name: ");
         name1 = keyboardIn.nextLine();
      
         System.out.println("Please enter the second name: ");
         name2 = keyboardIn.nextLine();
                  
         String answer = name1.concat(name2);
        
         System.out.println(name1 +" " +name2);        
         
      }
   }
}         
