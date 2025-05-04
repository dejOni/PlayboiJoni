import java.util.*;

public class MovTicket{
   public static void main(String[] args){
      
      double finTicket = 0;
      
      Scanner scan = new Scanner(System.in);
      
      System.out.println("Enter your age: ");
      int age = scan.nextInt();
      scan.nextLine();
      
      System.out.println("Enter the day of the week: ");
      String day = scan.nextLine(); 
      System.out.println("Are you a member?: (Yes/No) ");
      String member = scan.nextLine();
      
      System.out.println("Enter movie rating");
      System.out.println("G");
      System.out.println("PG");
      System.out.println("PG-13");
      System.out.println("R");
      String rating = scan.next();
      
      switch(rating.toUpperCase()){
         case "G":
            System.out.println("Suitable for all ages");
            break;
         case "PG":
            System.out.println("Parental guidance suggested");
            break;
         case "PG-13":
            System.out.println("Parents strongly cautioned");
            break;
         case "R":
            System.out.println("Restricted to 18 and above");
            break;
         default:
            System.out.println("Unknown Rating");
      }
      if(age < 13 || age > 60 && day.equalsIgnoreCase("Wednesday")){
         System.out.println("You qualify for a senior discount or kid discount and a Wednesday discount");
         finTicket = (250 * 0.80)- 50;
      }
         else if(day.equalsIgnoreCase("Wednesday")){
         System.out.println("You qualify for a Wednesday discount");
         finTicket = (250 - 50);
      }
         else if(member.equalsIgnoreCase("Yes")){
            System.out.println("You qualify for a membership discount");
            finTicket = 250 * 0.90;
      }
      if(finTicket <= 200){
            System.out.println("You get a free popcorn");
      }  
         else{
            System.out.println("No free popcorn");
      }      
      System.out.println("Your final ticket price is P" + finTicket);
   }
}