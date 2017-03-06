import java.util.Scanner;
public class P04B7
{

   public static void main (String[] args)
   {
      Scanner keyboardIn = new Scanner (System.in);
      {
         String telephone = new String();
       
              
         System.out.println("Please enter the 14 digit telephone number: ");
         telephone = keyboardIn.nextLine();
         
         String answer1 = telephone.substring(0,5);
         String answer2 = telephone.substring(5,7);
         String answer3 = telephone.substring(7);
         
         System.out.println("Country\tArea Code\tExchange Number");
         System.out.println(answer1 +"\t" +"0"+answer2 +"\t\t" +answer3);
                  
            
         
      }
   }
}         
