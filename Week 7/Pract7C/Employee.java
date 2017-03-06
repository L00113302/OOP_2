// Class for Employeee

public class  Employee
{
   // Instance variables
   private int number;
   private String name;
   private double salary;
   
   public Employee (int numberIn, String nameIn)
   {
   number=numberIn;
   name=nameIn;
   salary=0.0;
   }
   
   public Employee (int numberIn, String nameIn, double salaryIn)
   {
   number=numberIn;
   name=nameIn;
   salary=salaryIn;
   }
   

     public void setNumber(int numberIn)
   {
      number=numberIn;
   }
      
   public int getNumber()
   {
      return number;
   }
         
   public void setName(String nameIn)
   {
      name=nameIn;
   }
   
   public String name()
   {
      return name;
   }      
   
   public void setSalary(double salaryIn)
   {
      salary=salaryIn;
   }
   
   public double getSalary()
   {
      return salary;
   }      
      
   
   public void raise(double amount)
   {
      salary=salary+amount;
   }
   
   public void reduce(double amount)
   {
      salary=salary-amount;
   }
   
   public double calcMonthly()
   {
      return salary/12;
   }
   
   public double calcWeekly()
   {
      return salary/52;
   } 
   
   public double calcBonus(double percentIn)
   {
      return salary * percentIn;
   }   
}