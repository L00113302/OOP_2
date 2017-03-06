
import java.util.Scanner;

public class bottleTester
{
   public static void main(String[]args)
   {
   
      Scanner keyboardIn = new Scanner (System.in);

      int option=0;
      double amount=0.00;
      
      System.out.println("Enter the capacity of the bottle: ");
      double cap=keyboardIn.nextDouble();
      
      bottle WaterBottle = new bottle(cap);
      
      
      System.out.println("******Bottle*Menu*******");
      System.out.println(" 1. Fill bottle completely.");
      System.out.println(" 2. Check amount of water in bottle.");
      System.out.println(" 3. Check amount of water needed to fill bottle. ");
      System.out.println(" 4. Empty bottle. ");
      System.out.println(" 5. Pour an amount from bottle. ");
      System.out.println(" 6. Quit. ");
      System.out.println();
      
      do
      {
                 
         System.out.println("Please enter an option: ");
         option = keyboardIn.nextInt();
         
         switch(option)
         {
         case 1: System.out.println(" 1. Fill bottle completely ");
           WaterBottle.fillBottle();
           System.out.println(" The bottle level is " + WaterBottle.getCurrentLevel());
           
           break;
   case 2: System.out.println(" 2. Check amount of water in bottle ");
           WaterBottle.getCurrentLevel(); 
           System.out.println(" Current level is " + WaterBottle.getCurrentLevel());
           break;
   case 3: System.out.println(" 3. Check amount of water needed to fill bottle ");
           WaterBottle.getEmptySpace();
           System.out.println(" Empty space is " + WaterBottle.getEmptySpace());
           break;
   case 4: System.out.println(" 4. Empty bottle ");
           WaterBottle.emptyBottle();
           break;
   case 5: System.out.println(" 5. Pour an amount from bottle ");
           System.out.println(" Amount of water to pour out : ");
           amount = keyboardIn.nextDouble();
           WaterBottle.pourOut(amount);
           System.out.println(" The bottle has " + WaterBottle.getCurrentLevel() + " Water in it ");
           break;
   case 6: System.out.println(" Quit ");
           break;
    }
    }while (option !=6);   
  }
}   
 
