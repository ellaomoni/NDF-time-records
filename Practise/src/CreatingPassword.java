import static java.lang.System.*;
import java.util.Scanner;
public class CreatingPassword {
     public static void main(String[] args) {
         out.println("What is your Password?");

         Scanner keyboard = new Scanner(in);
         String password = keyboard.next();
         out.println("You typed >>" + password + "<<");
         out.println();
         if (password == "ELLA") {
             out.println("The word you typed is stored");
             out.println("in the same place as the real");
             out.println("password. You must be a");
             out.println("hacker.");
         } else {
             out.println("The word you typed is not");
             out.println("stored in the same place as");
             out.println("the real password, but that's");
             out.println("no big deal.");
         }
         out.println();
         if (("ELLA" .equals(password))) {
             out.println("The word you typed has the");
             out.println("same characters as the real");
             out.println("password. You can use our");
             out.println("precious system.");
         } else {
             out.println("The word you typed doesn't");
             out.println("have the same characters as");
             out.println("the real password. You can't");
             out.println("use our precious system.");
         }
         keyboard.close();

    }


}
