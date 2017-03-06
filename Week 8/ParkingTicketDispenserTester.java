/*  Written By:  Maeve Carr
	 Date:
	 Desc:
	 File:
*/

public class ParkingTicketDispenserTester
{
	public static void main(String[] args)
	{
		//create a ParkingTicketDispenser object
		ParkingTicketDispenser ticketMachine = new ParkingTicketDispenser();		
		//fill up with ten tickets
		ticketMachine.addTickets(10);
		
		//Buy some tickets
		ticketMachine.buyTicket();
		ticketMachine.buyTicket();
		ticketMachine.buyTicket();
		
		//check how many tickets in machine
		System.out.println("No of tickets: " +ticketMachine.getNoOfTickets());
		
		//check how many coins in machine
		System.out.println("No of coins: " +ticketMachine.getNoOfCoins());
		
	 	//empty the coins
 		ticketMachine.emptyCoins();
 		
		//check how many coins in machine
		System.out.println("After emptying coins\nNo of coins: " +ticketMachine.getNoOfCoins());
		
	
	}
}