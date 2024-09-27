
import java.io.Console;

public class ConsoleClassReader {
    public static void main(String[] args) {
        Console cns = System.console();

        System.out.print("Enter Username : ");
        String userName = cns.readLine();

        System.out.print("Enter Password : ");
        char[] password = cns.readPassword();

        System.out.println("You Entered : ");
        System.out.println("Username = " + userName);
        System.out.println("Password = " + new String(password));
    
    }
}
