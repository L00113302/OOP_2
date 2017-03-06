import java.util.Scanner;
public class P03B3
{

   public static void main (String[] args)
   {
      Scanner keyboardIn = new Scanner (System.in);
      
      // create an integer array with 5 integer elements
      char[] testArray = new char[] {'T','T','F','F','T','T','T','F','F','T'};
      char userAnswer;
      int correct=0, incorrect=0;
      int bonus=0, noOfStudents=0;
      
      System.out.println("Please enter the number of students: ");
      noOfStudents=keyboardIn.nextInt();
      
      int[] resultArray = new int[noOfStudents];
      
      for (int s=0; s<resultArray.length; s++)
      {
         System.out.println("Enter 10 answers T or F: ");   
         for(int i=0; i<testArray.length; i++)
         {
         System.out.print("Question " +(i+1) +":");
         userAnswer = keyboardIn.next().charAt(0);
         
      
      
            switch (userAnswer)
            {
               case 'T':
               case 'F':
                  if (userAnswer == testArray[i])
                     correct++;
                  if (userAnswer != testArray[i])
                     incorrect++;
                  bonus = (correct*2)-incorrect;
                  break;
               default: System.out.println ("Invalid entry enter T or F");
               i--;
            }
         }
      
      System.out.println ("Number of correct answers: " +correct);
      System.out.println ("Points scored: " +bonus);            
      }
   }   
}         