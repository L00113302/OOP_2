public class Student
{
   private String name;
   private int idNumber;
   private double marks;
   
   public Student(String nameIn, int idNoIn, double marksIn)
   {
      name = nameIn;
      idNumber = idNoIn;
      marks = marksIn;
   }
   
   public String getName()
   {
      return name;
   }
   
   public int getIdNumber()
   {
      return idNumber;
   }
   
   public double getMarks()
   {  
      return marks;
   }
   
   public String toString()
   {
   String s = ("Student Name: " +getName() +"\nStudent ID No: " +getIdNumber() +"\nStudent Marks: " +getMarks());
   return s;
   }
   
   public boolean equals(Student s)
   {
   return name.equals(s.name)&&idNumber==s.idNumber&&marks==s.marks;
   }

}
