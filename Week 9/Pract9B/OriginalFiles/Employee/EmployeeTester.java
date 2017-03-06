public class EmployeeTester
{
   public static void main(String [] args)
   {  
	   // create an instance of type Employee
	   Employee emp1 = new Employee(123, "Joe bloggs");
	   Employee emp2 = new Employee(334, "Jane bloggs", 15000);
	   
      	  	
		//test toString(); 
		 System.out.println("employee Details: ");
		 System.out.println(emp1);
		 System.out.println(emp2);
		  
		//check equals 
		if(emp1.equals(emp2))
			System.out.println(" emp1 and emp2 are the same"); //you would use to check for an existing emp and then do something
		else
			System.out.println(" emp1 and emp2 are different"); //or do something else - maybe add to list if not already in the list or whatever...
		
		Employee emp3 = new Employee(123, "Joe bloggs"); 
		
		if(emp1.equals(emp3))
			System.out.println(" emp1 and emp2 are the same"); //you would use to check for an existing emp and then do something
		else
			System.out.println(" emp1 and emp2 are different");	
   
   }
}
