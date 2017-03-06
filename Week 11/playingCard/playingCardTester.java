import java.util.*;
public class playingCardTester
{
   public static void main(String [] args)
   {  
      			  	
      Scanner keyIn = new Scanner(System.in);

      playingCard cards1 = new playingCard(3,5);
      playingCard cards2 = new playingCard(2,13);
      playingCard cards3 = new playingCard();
      {
      System.out.println("Suit= "+cards1.getSuit());
      System.out.println("Face= "+cards1.getFace());
      System.out.println("Colour= "+cards1.getColour());
      System.out.println(cards1.toString());
      System.out.println(cards1.equals(cards2));
      }
   }
}      