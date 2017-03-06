// Class for Area of Circle

public class  Circle
{
   // Instance variables
   private double radius;
   private double PI = 3.14;
   
   public void setRadius(double radiusIn)
   {
      radius=radiusIn;
   }
   
   public double getRadius()
   {
      return radius;
   }
   
   public double calcArea()
   {
      return PI*radius*radius;
   }
   
   public double calcCircum()
   {
      return 2*PI*radius;
   } 
   
}        