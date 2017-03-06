import java.util.Scanner;
public class P03B4
{

   public static void main (String[] args)
   {
      Scanner keyboardIn = new Scanner (System.in);
      
      char userAnswer;
      int correct=0, incorrect=0;
      int bonus=0, noOfStudents=0;
      int questions=0;
      
      System.out.println ("How many questions in the test? ");
      questions=keyboardIn.nextInt();
      
       char[] testArray = new char[questions];

       for (int t=0; t<testArray.length; t++)
       {
       System.out.print("Please enter the answer for question " +(t+1) +":");
       testArray[t]=keyboardIn.next().charAt(0);
       }
      
      System.out.println("Please enter the number of students: ");
      noOfStudents=keyboardIn.nextInt();
      
      int[] resultArray = new int[noOfStudents];
      
      for (int s=0; s<resultArray.length; s++)
      {
      bonus=0;
      correct=0;
      incorrect=0;
         System.out.println("Enter T or F: ");   
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
