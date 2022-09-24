package games;

import even.Even;
import greet.Greet;

public class Games {
    public static void games(String choice) {
        switch (choice) {
            case "1" -> Greet.name();
            case "2" -> Even.isEven(Greet.name());
            case "0" -> System.out.println("Meet u later");
            default -> System.out.println("Try again");
        }
    }
}
