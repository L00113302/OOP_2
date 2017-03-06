// Bank Account tester
// Tester class for Bank Account

public class DogTester
{
   public static void main(String[]args)
   {
   // create an instance of a type Oblong
   Dog myDog = new Dog();
   
   // use methods to create instance variables
   myDog.setSize(30);
   myDog.setBreed("Staff");
   myDog.getSize();
   myDog.getBreed();
   
   // use methods to retrieve values of instance variables
   System.out.println("Size: " +myDog.getSize() +" Breed: "+myDog.getBreed());
      
   }
}   