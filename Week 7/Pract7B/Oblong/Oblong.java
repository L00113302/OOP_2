// Oblong Class
// Class representing a four sided rectangular shape

public class Oblong
{
	// instance variables
   private double height;
   private double width;
   
   // consrtuctors
   public Oblong()
   {
      height=0;
      width=0;
   }
   
   public Oblong(double widthIn, double heightIn)
   {
   
   if (heightIn<0 || widthIn<0)
   {
      System.out.println("No good sa!");
   }
   else
   height=heightIn;   
   width=widthIn;

   }

	// methods
   public double getHeight()
   {	
      return height;		
   }

   public double getWidth()
   {	
      return width;		
   }

   public void setWidth(double widthIn)
   {	
      width = widthIn;
   }

   public void setHeight(double heightIn)
   {	
      height = heightIn;
   }
	
   public double calculateArea()
   {	
      return width * height;
   }	
	
   public double calculatePerim()
   {	
      return (width + height) * 2;
   }	
	
   public boolean isSquare()
   {
   	// if(width == height)
   // 			return true;
   // 		else
   // 			return false;
      return width == height;
   }
	
	//accessSpec returnType name(arg_list)
   public void grow(double widthAmt, double heightAmt)
   {
      width += widthAmt; //width = width + widthAmt;
      height += heightAmt;
   }


}// end of class