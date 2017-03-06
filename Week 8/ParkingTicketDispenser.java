/*  Written By:  Maeve Carr
	 Date:
	 Desc:
	 File:
*/

 
   public class ParkingTicketDispenser
   {
   //instance fields 
      private int noOfTickets;
      private int noOfCoins;
   
   //methods
   //adds ticket to noOfTickets
      public void addTickets(int ticketsIn)
      {
         noOfTickets = noOfTickets + ticketsIn;
      }
   
		//empties coins
      public void emptyCoins()
      {
         printReceipt();  //note how you call method from within class
			noOfCoins = 0;  //reset no of coins to  to zero
      }
   
		//increases no of coins reduces no of tickets
      public void buyTicket()  //or you could call it insertCoin()
      {
			if(noOfTickets > 0)  //as long as there is a ticket in the machine..
			{
      		//add 1 to noOfCoinss
         	noOfCoins++;  // or noOfCoins = noOfCoins + 1
      		//subtract 1 from noOfTickets
         	noOfTickets--;   //or  noOfTickets = noOfTickets - 1; 
			}
			// else   ///THIS IS OK - BUT SHOULD REALLY DEAL WITH IN MAIN
// 			{
// 				System.out.println("MACHINE EMPTY -- CALL FOR ASSISTANCE!!");
// 				System.out.println("Coin has been return in delivery slot");
// 	      }
		}
   
	//returns no of coins
      public int getNoOfCoins()
      {
         return noOfCoins;
      }
   //returns no of tickets
	   public int getNoOfTickets()
      {
         return noOfTickets;	
      }
	
	//returns amount of money in machine	
		public double calcMoney()
		{
			//return noOfCoins * .5;
			double money = noOfCoins * .5;
			return money;
		}
	
	//display receipt with no of coins and amount of money	
		public void printReceipt()
		{
			System.out.println("***********************************");
			System.out.println("Parking Ticket Dispenser Receipt");
			System.out.println("***********************************");
			System.out.println("No of Coins: "  +noOfCoins); // OR  +getNoOfCoins());	
			System.out.println("Total Money: " +calcMoney());
			System.out.println("***********************************");
			//NOTE how we can call a method from with in another method - not called on object - why??
		}
   }//end class