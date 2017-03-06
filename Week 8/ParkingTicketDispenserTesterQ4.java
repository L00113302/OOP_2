/*  Written By:  Maeve Carr
	 Date:
	 Desc:
	 File:
*/

 
import java.util.*;

public class ParkingTicketDispenserTesterQ4
{
	public static void main(String[] args)
	{
		//construct an object of type Scanner
		
		Scanner keyboardIn = new Scanner(System.in);

		//construct an object of type ParkingTicketDispenser called ticketMachine
		ParkingTicketDispenser ticketMachine = new ParkingTicketDispenser();
		int option;
		
		do{
			System.out.println("\n\nParking Ticket Menu\n1. Purchase a Ticket\n2. Fill with Tickets ");
			System.out.println("3. Empty Coins\n4. Display amount of money in machine \n5. Display number of Tickets");
			System.out.println("6. Quit");			
			System.out.print("Select option: ");
			option = keyboardIn.nextInt();
			
			switch(option)
			{
				case 1: 	if(ticketMachine.getNoOfTickets() > 0)
								ticketMachine.buyTicket();   ///buy a ticket
							else 
							{
								System.out.println("MACHINE EMPTY -- CALL FOR ASSISTANCE!!");
				 				System.out.println("Coin has been return in delivery slot");
							}
							break;
				case 2: 	System.out.print("How many tickets are you putting in?  ");
							int tickets = keyboardIn.nextInt();
							ticketMachine.addTickets(tickets);  //add tickets to machine
							break;
				case 3:  ticketMachine.emptyCoins();  //empty coins
							break;
				case 4: 	System.out.print("Total money in machine is ");
							System.out.println(ticketMachine.calcMoney());
							break;
				case 5:	System.out.print("Ticket count is ");
							System.out.println(ticketMachine.getNoOfTickets());
							break;
				case 6:	System.out.println("You have chosen to exit...");
							break;
				default: System.out.println("Invalid option chosen..");
			}//end switch
	
		}while(option != 6);				
		

	}
}
