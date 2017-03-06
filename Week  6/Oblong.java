// Oblong Class
// Class representing a four sided rectangular shape

public class Oblong
{

	// instance variables
	private double height;
	private double width;

	// methods
   //returns the height
	public double getHeight()
	{	
		return height;		
	}
   //returns the width
	public double getWidth()
	{	
		return width;		
	}

   //sets the width
	public void setWidth(double widthIn)
	{	
		width = widthIn;
	}
   //sets the height
	public void setHeight(double heightIn)
	{	
		height = heightIn;
	}
	//calcs and return the area
	public double calculateArea()
	{	
		return width * height;
	}	
	
   public double calculatePerimeter()
   {
      return width+width+height+height;
   }
   
   public boolean isSquare()
   {
   if (height==width)  
      {
     return true;
      }
   else
      {
     return false;
      }
   }        
   
   public void increaseSize(double w, double h)
   {
   height = height + h;
   width = width + w;
   }

}// end of class