package hexlet.code.app;

import games.Progression;
import games.Gcd;
import games.Calc;
import games.Even;
import games.Prime;
import java.util.Scanner;
import hexlet.code.Cli;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet\n2 - Even\n3 - Calc\n4 - GCD\n5 - Progression\n6 - Prime\n0 - Exit");
        System.out.print("Your choice? ");
        Scanner scanner = new Scanner(System.in);
        var choice = scanner.nextLine();

        switch (choice) {
            case "1" -> Cli.greeting();
            case "2" -> Even.isEven();
            case "3" -> Calc.calc();
            case "4" -> Gcd.gcd();
            case "5" -> Progression.startProgression();
            case "6" -> Prime.startPrime();
            case "0" -> System.out.println("Meet u later");
            default -> System.out.println("Try again");
        }
    }
}
