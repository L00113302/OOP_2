//***
// Written by: Maeve Carr
//
// This class implements a clock. It has three
// instance variables to store hours, minutes, and seconds,
// and a number of simple methods to implement operations on time.
//***

public class Clock
{
   private int hrs;     
   private int mins; 
   private int secs; 
      
    // Constructors
   public Clock()
   {
      hrs=0;
      mins=0;
      secs=0;
   }
    
   public Clock (int hrsIn, int minsIn, int secsIn)
   {
      hrs=hrsIn;
      mins=minsIn;
      secs=secsIn;
   }
   
   
    //Method to set the hours
   public void setHours(int hrsIn)
   {
      if (0 <= hrsIn && hrsIn < 24)
         hrs = hrsIn;
      else
         hrs = 0;
   } //end setHours
   
    //Method to set the minutes
   public void setMinutes(int minsIn)
   {
      if (0 <= minsIn && minsIn < 60)  //if time is valid
         mins = minsIn;
      else
         mins = 0;
   } //end setMinutes
   
   //Method to set the seconds
   public void setSeconds(int secsIn)
   {
      if (0 <= secsIn && secsIn < 60)
         secs = secsIn;
      else
         secs = 0;
   } //end setSeconds
   
   public void setTime(int hrsIn, int minsIn, int secsIn)
   {
      // 	hrs = hrsIn;  
      // 		mins = minsIn;
      // 		secs = secsIn;
      
      //or alternatively
      setHours(hrsIn);
      setMinutes(minsIn);
      setSeconds(secsIn);
   }
   
    //Method to return the hours
   public int getHours()
   {
      return hrs;
   } //end getHours
   
   //Method to return the minutes
   public int getMinutes()
   {
      return mins;
   } //end getMinutes
   
    //Method to return the seconds
   public int getSeconds()
   {
      return secs;
   } //end getSeconds
   
      //Method to increment the time by one second
   public void tickTock()
   {
      secs++;
      
      if (secs > 59)
      {
         secs = 0;//reset seconds
         mins++; //increment minutes
      }
      if (mins > 59)
      {
         mins = 0;
         hrs++; //increment hours
      }
      if (hrs > 23)
         hrs = 0;
      
      
   } //end tickTock
   
   public String toString()
   {
      String str = " ";
      if (hrs<10)
         str="0";
      str = str+hrs +":";
      
      if (mins<10)
         str = str +"0";
      str = str+mins +":";
      
      if (secs<10)
         str = str +"0";
      str = str+secs +":";
      
      return str;
   } 
   
   public boolean equals (Clock otherClock)
   {
      return (hrs == otherClock.hrs && mins == otherClock.mins && secs == otherClock.secs);
   }  
             
      
}


