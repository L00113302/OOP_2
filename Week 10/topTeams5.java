import java.util.*;
public class topTeams5
{
   public static void main(String [] args)
   {  
      Scanner keyboardIn = new Scanner (System.in);
       
              
      ArrayList <String> teamName = new ArrayList<String>();
      String teams = " ";
      int pos=0;
      int choice=0;
      
   
       
      for (int i=0; i<5; i++)
      {
         System.out.println("Please enter the team name: ");
         teams=keyboardIn.nextLine();
         teamName.add(teams);
      }
      
      do
      {
         System.out.println("*****League Menu******");
         System.out.println(" 1. View all teams ");
         System.out.println(" 2. View one team (Based on position)");
         System.out.println(" 3. Add a team (To end of list)");  
         System.out.println(" 4. Insert a team in list ");
         System.out.println(" 5. Remove a team ");
         System.out.println(" 6. Remove a team (Based on position)");
         System.out.println(" 0. Exit ");
      
         System.out.println("Please make a selection: ");
         choice=keyboardIn.nextInt();
      
         switch(choice)
         {
            case 1:
               keyboardIn.nextLine();  
               for (int i=0; i<teamName.size(); i++)
               {
                  System.out.println(teamName.get(i));
               }
               break;
         
            case 2: 
               keyboardIn.nextLine();
               System.out.println("Please enter the position: ");
               pos=keyboardIn.nextInt();
               System.out.println(teamName.get(pos));
               break;  
         
            case 3:  
               keyboardIn.nextLine();
               System.out.println("Enter name: ");
               teams=keyboardIn.nextLine();
               teamName.add(5,teams);
               break;
         
            case 4: 
               keyboardIn.nextLine(); 
               System.out.println("Enter name: ");
               teams=keyboardIn.nextLine();
               System.out.println("Please enter the position: ");
               pos=keyboardIn.nextInt();
               teamName.add(pos,teams);   
               break;
         
            case 5:
               keyboardIn.nextLine();
               System.out.println("Please enter the name of the team you want to remove: ");
               teams=keyboardIn.nextLine();
               teamName.remove(teams);
               break;
         
            case 6:  
               keyboardIn.nextLine();
               System.out.println("Please enter the position: ");
               pos=keyboardIn.nextInt();
               teamName.remove(pos); 
               break;
         }
      }while(choice!=0);                
            
      
   
   }
}    
