import java.util.*;


public class P10B2
   {
   public static void main(String [] args)
      {  
       Scanner keyboardIn = new Scanner (System.in);
       String word = " ";
       int choice = 0;
       int pos = 0;
       
              
       ArrayList <String> wordList = new ArrayList<String>();{{
         wordList.add("apple");
         wordList.add("cat");
         wordList.add("ball");
         wordList.add("dog");
         
         }};
         
         do
         {
         System.out.println("*****League Menu******");
         System.out.println(" 1. Add word ");
         System.out.println(" 2. Remove word");
         System.out.println(" 3. View a word");  
         System.out.println(" 4. View all words ");
         System.out.println(" 5. Add word to particular position ");
         System.out.println(" 0. Exit ");

         System.out.println("Please enter a selection: ");
         choice = keyboardIn.nextInt();
         
         switch (choice)
         {
         case 1: 
         keyboardIn.nextLine();
         System.out.println("Enter word: ");
         word=keyboardIn.nextLine();
         wordList.add(word);
         break;
         
         case 2:
         keyboardIn.nextLine();
         System.out.println("Please enter the word to remove: ");
         word=keyboardIn.nextLine();
         wordList.remove(word);
         break;
         
         case 3:
         keyboardIn.nextLine();
         System.out.println("Please enter the position: ");
         pos=keyboardIn.nextInt();
         System.out.println(wordList.get(pos));
         break; 
         
         case 4:
          keyboardIn.nextLine();  
               for (String w : wordList)
               {
                  System.out.println(w);
               }
               break;
         
         case 5:
         keyboardIn.nextLine();
         System.out.println("Enter the word: ");
         word=keyboardIn.nextLine();
         System.out.println("Enter the position to add word: ");
         pos=keyboardIn.nextInt();
         wordList.add(pos, word);   
               
         }
      }while(choice!=0);  
            
             
   }
}   
