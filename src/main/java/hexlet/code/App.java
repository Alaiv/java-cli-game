package hexlet.code;
import java.util.Scanner;
import even.Even;
import greeting.Greeting;


public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet\n2 - Even\n0 - Exit");
        System.out.print("Your choice? ");
        Scanner scanner = new Scanner(System.in);
        var choice = scanner.nextLine();

        Greeting.games(choice);
    }

}
