/*
	Written by : Maeve Carr
	Date:
	Desc:
*/


// Employee class


public class Employee
{
	// instance variables
	private int empNo;
	private double salary;
	private String name;
   private static int nextEmpNo = 200;  //only one copy exists- used for setting idno
   private static double bonusRate = 5;  //make default 5%
   
   //constructors
	public Employee(String nameIn)
	{
		empNo = nextEmpNo++;
		name = nameIn;
		salary = 0.0; 
	}
	
	public Employee(String nameIn, double salaryIn)
	{
		empNo = nextEmpNo++;
		name = nameIn;
		salary = salaryIn;
	}

	
	// methods
   //returns the empNo
	public int getEmpNo()
	{	
		return empNo;		
	}

	public void setName(String nameIn)
	{	
		name  = nameIn;		
	}
	
	public String getName()
	{	
		return name;		
	}
	
	public void setSalary(double salaryIn)
	{	
		salary  = salaryIn;		
	}
	
	public double getSalary()
	{	
		return salary;		
	}
	
	public void raiseSalary(double raise)
	{
		salary += raise;
	}
	
	public void reduceSalary(double reduction)
	{
		salary -= reduction;
	}
   
	public double calcMonthlyPay()
	{
		return salary/12;
	}
	
	public double calcWeeklyPay()
	{
		return salary/52;
	}
   
   //parameter %bonus
	public double calcBonus(double percentBonus)
	{
		return  salary * (percentBonus/100);
	}
   //overloaded method - if no param passed in uses static bonusRate
   public double calcBonus()
	{
		return  salary * (bonusRate/100);
	}

	
   public static double getBonusRate()
   {
      return bonusRate; 
   }
   
   public static void setBonusRate(double rateIn)
   {
      bonusRate = rateIn; 
   }

	//override the toString method
	public String toString()
	{
		String s = "Employee ID No: " +empNo +"\nName: " 
				+name +"\nSalary: €" +salary
            + "\nBonus rate: " +bonusRate;   //don't really want this here - but for testing
				
		return s; 
	}
	
	//override the equals method
	public boolean equals(Employee e)
	{
		return empNo == e.empNo && salary == e.salary
					&& name.equalsIgnoreCase(e.name);   //NOTE use of String method equals.
		//NOTE : you may decide that employees are deemed the same if they have same ID no 
		//and same Name - regardless of salary....
	}


}// end of class