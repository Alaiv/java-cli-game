package hexlet.code;
import java.util.Scanner;

import games.Calc;
import games.Even;
import greet.Greet;


public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet\n2 - Even\n3 - Calc\n0 - Exit");
        System.out.print("Your choice? ");
        Scanner scanner = new Scanner(System.in);
        var choice = scanner.nextLine();

        switch (choice) {
            case "1" -> Greet.name();
            case "2" -> Even.isEven(Greet.name());
            case "3" -> Calc.calc(Greet.name());
            case "0" -> System.out.println("Meet u later");
            default -> System.out.println("Try again");
        }
    }
}
