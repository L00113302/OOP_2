/*
	Written by : Maeve Carr
	Date:
	Desc:
*/
import java.util.*;
public class Q4EmployeeMenu
{
   public static void main(String [] args)
   {  
      			  	
      Scanner keyIn = new Scanner(System.in);
   	//create an arrayList of employee object
      ArrayList<Employee> empList = new ArrayList<Employee>();
      
      empList.add(new Employee("Dermot",150.00));
      empList.add(new Employee("Mark",500.00));
      empList.add(new Employee("Corey",200.00));
      empList.add(new Employee("James",400.00));
   
      String name;
      int option, idNo;
      double sal;  
      boolean found; 
      double total=0.00;
   	
      do{
      	//display menu on screen
         System.out.println("\n  MAIN MENU "    );
         System.out.println("1. View all employees\n2. Add employee\n3. Remove employee\n4. Display one employee\n5. Display highest paid employee\n6. Display lowest paid employee\n7. Display total salaries\n8. Give raise to employee\n9. No of employee with name beginning with ?\n0. Exit"    );
      
         System.out.print("Enter your option: "); 
         option  = keyIn.nextInt();
      	
         switch(option)
         {
            case 1:	System.out.println("\nEmployee Details: ");
               for(Employee d : empList)
               {
                  System.out.println(d); //can only do this because of toString()
               } 
            
               break;
            case 2:	System.out.print("Enter employee name :"    );
               keyIn.nextLine();//clears the buffer
               name = keyIn.nextLine();
               System.out.print("Enter starting salary :"    );
               sal = keyIn.nextDouble();
            
            			//create an employee object
               Employee e = new Employee(name, sal); 
            
            			//add the employee object to the arraylist
               empList.add(e);  
            
               break;
            case 3:  //remove employee
               System.out.print("Enter employee ID: ");
               idNo = keyIn.nextInt();
                     //must find employee first 
                     //then remove
                                  
               break;
            case 4: // Display one employee
               keyIn.nextLine();//clears the buffer
               System.out.print("Enter employee ID: ");
               idNo = keyIn.nextInt();
               for(Employee d : empList)
               {
                  if(d.getEmpNo() == idNo)
                  {
                     System.out.println(d);
                  }
               }
                     
               break;
            case 5: // Display highest paid employee
               keyIn.nextLine();//clears the buffer
               Employee highest=empList.get(0);
               for(Employee d : empList)
               {
                  if(d.getSalary()>highest.getSalary())
                     highest=d;
               }
               System.out.println(highest);
                     
               break;
            case 6: // Display lowest paid employee
               keyIn.nextLine();//clears the buffer
               Employee lowest=empList.get(0);
               for(Employee d : empList)
               {
                  if(d.getSalary()<lowest.getSalary())
                     lowest=d;
               }
               System.out.println(lowest);
                     
               break;
            case 7: // Display total salaries
               keyIn.nextLine();//clears the buffer
               for(Employee d : empList)
               {
                  total=total+d.getSalary();
               }
               System.out.println("Total Salaries: "+total);
                     
               break;
            case 8: // Give raise to an employee
               keyIn.nextLine();//clears the buffer
               System.out.println("Enter employee ID No: ");
               idNo = keyIn.nextInt();
               System.out.println("Enter amount of raise; ");
               double raise = keyIn.nextDouble();
               for(Employee d : empList)
               {
                  if(d.getEmpNo() == idNo)
                  raise=raise+d.getSalary();
               }
               System.out.println("Salary of employee "+idNo +" with raise added: " +(raise));   
               
               break;
            case 9: // No of employee with name beginning with ?
                   keyIn.nextLine();//clears the buffer
                   System.out.println("Please enter the first Initial: ");
                   char initial=keyIn.next().charAt(0);
                   for(Employee d : empList)
                   {
                   String s = d.getName();
                     if (s.startsWith(initial))
                     {
                     count++;
                     }
                     {
                     System.out.println("Employee's ID No: " +d.getEmpNo());
                     }
                   }  
                   
                   break;  
            case 0:
               break;
            default: 
               System.out.println("Invalid option entered.");		
         }//end switch
      					
      }while(option != 0); 
      
           
   
   
   } 

}
