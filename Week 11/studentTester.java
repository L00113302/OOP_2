import java.util.*;


public class studentTester
{
   public static void main(String [] args)
   {  
      Scanner keyboardIn = new Scanner (System.in);
       
      int count=0;
      int studentNo=0;
      int average=0;
      int sum=0;
      
      ArrayList <Student> myStudents  = new ArrayList<Student>();
      {
         {
            myStudents.add(new Student("Mark",1111,50.00));
            myStudents.add(new Student("Dermot",1112,60.00));
            myStudents.add(new Student("Corey",1113,54.00));
            myStudents.add(new Student("Lindsay",1114,56.00));
         }};
      
      for(Student s:myStudents)
      {
         System.out.println(s.toString());
         count++;
         System.out.println("Number of student objects: "+count);
         System.out.println(myStudents.equals(s));
      }
      
      System.out.println("Please enter the student number: ");
      studentNo=keyboardIn.nextInt();
      
      for(Student n:myStudents)
      {
         if(n.getIdNumber()==studentNo)
         {
            System.out.println(n);
         }
      }
      
      for(Student a:myStudents)
      {
         sum=sum+myStudents.getMarks();
      }   
      
      
      
      
   }
}   
