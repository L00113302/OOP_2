public class playingCard
{
   // instance variables
   private int suit=0;
   private int face=0;
   
   // constructors
   public playingCard()
   {
      suit=4;
      face=1;
   }
   
   public playingCard(int suitIn, int faceIn)
   {
      if(suitIn>=1 && suitIn<=4&&faceIn>=1 && faceIn<=13)
      {
         suit=suitIn;
         face=faceIn;
      }   
   }
   
   // methods
   public String getSuit()
   {
      String s= " ";
      switch(suit)
      {
         case 1: s="Club";
            break;
      
         case 2: s="Spades";
            break;
      
         case 3: s="Diamonds";
            break;
      
         case 4: s="Hearts";
            break;
      
        default: s="Unknown type";      
        }
      return s;
   }
   
   public String getColour()
   {
      if (face==1||face==2)
      {
         return "Black";
      }
      else
      {
         return "Red";
      }
   }
   
   public String getFace()
   {
      String f=" ";
      switch (face)
      {
         case 1: f="Ace";
            break;
         case 2: f="Two";
            break;
         case 3: f="Three";
            break;
         case 4: f="Four";
            break;
         case 5: f="Five";
            break;
         case 6: f="Six";
            break;
         case 7: f="Seven";
            break;
         case 8: f="Eight";
            break;
         case 9: f="Nine";
            break;
         case 10: f="Ten";
            break;                        
         case 11: f="Jack";
            break;
         case 12: f="Queen";
            break;
         case 13: f="King";
            break;
      }
      return f;
   }
   
   public String toString()
   {
   String s= "Suit: " +getSuit() +"\nFace: " +getFace() +"\nColour: " +getColour();
   
   return s;
   }
   
   public boolean equals(playingCard c)
   {
   return suit == c.suit && face == c.face;
   }  
   
   
   
   
   
}   
   
   
