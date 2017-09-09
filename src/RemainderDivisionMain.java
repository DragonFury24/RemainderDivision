import java.util.*;

public class RemainderDivisionMain {
   public static void main (String[] args) {
      Scanner keyboard = new Scanner(System.in);
      System.out.println("Please input the first number");
      double num0 = dInput(keyboard);
      System.out.println("Please input the second number");
      double num1 = dInput(keyboard);
      System.out.println((int)num0 + " divided by " + (int)num1 + " is " + (int)(num0 / num1) + " with a remainder of " + (int)(num0 % num1));
   
   }

   private static double dInput(Scanner keyboard) { //checks if input is a double. If not, then will give error and force user to retry
      double dOutput = 0;
      boolean noInput = true;
      while (noInput) {
         try {
            dOutput = keyboard.nextDouble();
            noInput = false;
         } catch (InputMismatchException I) {
            System.out.println("You did not input a number. Please try again.");
            keyboard.next();
         }
      }
      return dOutput;
   }
}