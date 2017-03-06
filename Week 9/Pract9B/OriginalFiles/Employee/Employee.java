

public class Employee
{
	// instance variables
	private int empNo;
	private double salary;
	private String name;
   public static int empID = 1111;
   public static double bonusRate = 0.25;

	public Employee(int empNoIn, String nameIn)
	{
		empNo = empID++;
		name = nameIn;
		salary = 0.0; 
	}
	
	public Employee(int empNoIn, String nameIn, double salaryIn)
	{
		empNo = empID++;
		name = nameIn;
		salary = salaryIn;
	}

	
	// methods
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
	public double calcBonus(double percentBonus)
	{
		return  salary * bonusRate;
	}
	
	//override the toString method
	public String toString()
	{
		String s = "Employee ID No: " +empNo +"\nName: " 
				+name +"\nSalary: €" +salary; 
				
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
   
   public static void setBonusRate (double rateIn)
   {
   bonusRate = rateIn;
   }
   


}// end of class