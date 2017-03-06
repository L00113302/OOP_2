
public class ClockTester
{
   public static void main(String [] args)
   {  
	   // create an instance of type Clock
	   Clock myclock = new Clock();
      Clock myClock1 = new Clock(2,23,50);	  	   
	
      System.out.println(myclock);  
		for(int i = 0; i < 11000; i++)
			myclock.tickTock();
			
		 System.out.println(myclock.toString()); 	//this calls .toString()
       
       System.out.println(myClock1.toString());
       
       if (myclock.equals(myClock1))
       {
         System.out.println ("Same time.");
       }
       
       else 
       {
         System.out.println ("Different time.");
       }      
	
   }
}
