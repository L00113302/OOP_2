// Class to Convert Euro and Sterling

public class CurrencyConverter
{
   private double rate;

   public void setRate(double RateIn)
   {
      rate=RateIn;
   }
   
   public double getRate()
   {
      return rate;
   }     
   
   public double convertToSterling(double amount)
   {
      return  rate*amount;
   }
   
   public double convertToEuro(double amount)
   {
      return  amount/rate;
   }
   
      
}            