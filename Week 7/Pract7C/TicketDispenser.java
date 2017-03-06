public class TicketDispenser
{
   //instance variables 
   private int noOfTickets;
   private int noOfCoins; 
   
   // constructors
   public TicketDispenser()
   {
   noOfTickets=0;
   noOfCoins=0;
   }
   
   public void addTickets(int ticketsIn)
   {
   noOfTickets=ticketsIn+noOfTickets;
   }
   
   public void emptyCoins()
   {
   printReceipt();
   noOfCoins=0;  
   }
	
   public void buyTicket()
   {
      if (noOfTickets>0)
      {
      noOfTickets--;
      noOfCoins++;
      }
   }
   
   public int getNoOfCoins()
   {
      return noOfCoins;
   }
   
   public int getNoOfTickets()
   {
      return noOfTickets;
   }
   
   public double calcMoney()
   {
      double money=noOfCoins*.50;
      return money;
   }
   
   public void printReceipt()
		{
			System.out.println("***********************************");
			System.out.println("Parking Ticket Dispenser Receipt");
			System.out.println("***********************************");
			System.out.println("No of Coins: "  +noOfCoins); // OR  +getNoOfCoins());	
			System.out.println("Total Money: " +calcMoney());
			System.out.println("***********************************");
      }         
   
}   
     