// program using array lists
import java.util.*;


public class topTeams
   {
   public static void main(String [] args)
      {  
       Scanner keyboardIn = new Scanner (System.in);
       
              
       ArrayList <String> teamName = new ArrayList<String>();
       String teams = " ";
       int pos=0;

       
       for (int i=0; i<5; i++)
       {
       System.out.println("Please enter the team name: ");
       teams=keyboardIn.nextLine();
       teamName.add(teams);
       }
       
       System.out.println("Enter name: ");
       teams=keyboardIn.nextLine();
       System.out.println("Please enter the position: ");
       pos=keyboardIn.nextInt();
       teamName.add(pos,teams);
       

       
       for (int i=0; i<teamName.size(); i++)
       {
       System.out.println(teamName.get(i));
       }
       
       }
   }    
       
       

