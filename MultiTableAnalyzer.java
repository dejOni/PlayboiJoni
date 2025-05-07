import java.util.*;

public class MultiTableAnalyzer{

   public static void main(String[] args){
      int factAns = 1;
      int i;
      int o = 1;
      int p = 1;
      String choice;
      
      Scanner scan = new Scanner(System.in);
      
      do{ 
         System.out.println("Enter a number: ");
         int a = scan.nextInt();
         
         scan.nextLine();
         
         System.out.println("\n" + "--- Multiplacation Table of " + a + " ---" + "\n");
      
         for(i = 1; i <= 10; i++){
         int sub = a * i;
            System.out.printf("%d x %d = %d\n", a, i, sub);
         }
     
         while (o <= a) {
            factAns *= o;
            o++;
         }
         System.out.println("\n" + "--- Factorial of " + a + " ---" + "\n");
         System.out.printf("%d! = %d\n",a , factAns);
         System.out.println();
      
         System.out.println("--- " + "Multiplication Chart (" + p + " to " + a + ") ---\n");
         for(p = 1; p <= a; p++){
               for(int l = 1; l <= a; l++){
                  System.out.printf("%4d", p * l);
               }          
            System.out.println();
          }
            do{
               System.out.println("\nDo you want to try another number? (yes/no):");
               choice = scan.nextLine().toLowerCase();
            
            if(!choice.equalsIgnoreCase("yes") && !choice.equalsIgnoreCase("no")){
               System.out.println("INVALID INPUT I SPECIFICALLY ASKED FOR YES/NO");
               }
            
             }while(!choice.equalsIgnoreCase("yes") && !choice.equalsIgnoreCase("no"));

         }while(choice.equalsIgnoreCase("yes"));
            System.out.println("OK!! GOODBYE!!!");
         
    } 
}