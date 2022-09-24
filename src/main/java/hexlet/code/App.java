package hexlet.code;

import games.Calc;
import games.Even;
import games.Gcd;

import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet\n2 - Even\n3 - Calc\n4 - GCD\n0 - Exit");
        System.out.print("Your choice? ");
        Scanner scanner = new Scanner(System.in);
        var choice = scanner.nextLine();

        switch (choice) {
            case "1" -> Cli.name();
            case "2" -> Even.isEven(Cli.name());
            case "3" -> Calc.calc(Cli.name());
            case "4" -> Gcd.gcd(Cli.name());
            case "0" -> System.out.println("Meet u later");
            default -> System.out.println("Try again");
        }
    }
}
