import java.util.Scanner;
public class P04B6
{

   public static void main (String[] args)
   {
      Scanner keyboardIn = new Scanner (System.in);
      {
         String word1 = new String();
         String word2 = new String();
       
              
         System.out.println("Please enter the first word: ");
         word1 = keyboardIn.nextLine();
      
         System.out.println("Please enter the second word: ");
         word2 = keyboardIn.nextLine();
         
         if (word1.compareTo(word2)==0)
         
            System.out.print("The two words are equal.");
         
         else if (word1.compareTo(word2)<0)
         
            System.out.println(word1 +" comes before " +word2 +" in the dictionary.");
         
         else if (word1.compareTo(word2)>0)
         
            System.out.println(word2 + " comes before " +word1 +" in the dictionary."); 
         
            
         
      }
   }
}         
