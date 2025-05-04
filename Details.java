/**
Main method is Student.java

this second file is the backbone of Student.java and is responsible for getters and setters 
*/


public class Details
{
   private String name;
   private String subject;
   private float grade;
   
   public Details(String name,String subject)
   {
      this.name = name;
      this.subject = subject;
      this.grade = 0.0f;
   }
   public String getName()
   {
      return name;
   }
   public float getGrade()
   {
      return grade;
   }
   public void setGrade(float grade)
   {
      this.grade = grade;
   }
   public void Display()
   {
      System.out.println("Name: " + name);
      System.out.println("Subject: " + subject);
      System.out.println("Grade: " + grade);
   }
}
