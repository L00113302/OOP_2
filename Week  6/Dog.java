public class Dog
{ 
//instance variables
   private int size;
   private String breed; 
  //methods 
   public void setSize(int sizeIn) 
   {
      size = sizeIn; 
   } 
   public int getSize() 
   { 
      return size; 
   } 
   public void setBreed(String breedIn) 
   {
      breed = breedIn; 
   }
   public String getBreed() 
   { 
      return breed; 
   } 
   
   public String Bark() 
   { 
   if (size<10)
      
      return "yap,yap";
      
   else if (size<30)
         
      return "bow, wow";
      
   else
      
      return "ruff,ruff";
    }          
    
}