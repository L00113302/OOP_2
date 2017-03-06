public class bottle
{

 // declare instance variables
 private double maxCapacity;
 private double currentLevel;
 
 // constructors
 public bottle()
 {
   maxCapacity=1;
   currentLevel=1;
 }
 
  public bottle(double amount)
   {
      maxCapacity = 1;
      currentLevel = amount;
   }
 // methods
   public void fillBottle()
   {
      currentLevel = maxCapacity;
   }
   public void emptyBottle()
   {
       currentLevel = 0;
   }
   public double getCurrentLevel()
   {
      return currentLevel;
   }
   public double getEmptySpace()
   {
      return maxCapacity - currentLevel;
   }
   public void pourOut(double amount)
   {
      if (amount>maxCapacity)
          System.out.println(" Not enough water in bottle : ");
      else if (amount>currentLevel)
      System.out.println(" Not enough liquid water in bottle : ");
      else
          currentLevel = currentLevel - amount;
   }
}          
     