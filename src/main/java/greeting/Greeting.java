package greeting;

import even.Even;
import hexlet.code.Cli;

public class Greeting {
    public static void games(String choice) {
        switch (choice) {
            case "1" -> Cli.userName();
            case "2" -> Even.isEven(Cli.userName());
            case "0" -> System.out.println("Meet u later");
        }
    }
}
