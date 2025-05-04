/**
   The main method for Details.java

   The body of Details.java
*/


public class Student
{
   public static void main(String[] args)
   {
      Details std1 = new Details("Alice","Comprog");
      Details std2 = new Details("John","Math");
      
      std1.setGrade(100);
      std2.setGrade(80);
      
      std1.Display();
      System.out.println();
      std2.Display();
   }
}
