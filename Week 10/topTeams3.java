import java.util.*;
public class topTeams3
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
       System.out.println("Please enter the name of the team you want to remove: ");
       teams=keyboardIn.nextLine();
       teamName.remove(teams);
       

       
       for (int i=0; i<teamName.size(); i++)
       {
       System.out.println(teamName.get(i));
       }
       
       }
   }    
       
