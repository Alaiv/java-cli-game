package hexlet.code;

import games.Progression;
import games.Gcd;
import games.Calc;
import games.Even;
import games.Prime;
import java.util.Scanner;

public class Engine {
    public static void questions(String type, String message) {
        var name = Cli.greeting();
        System.out.println(message);

        Scanner sc = new Scanner(System.in);
        int answersCount = 0;
        final var winCondition = 3;
        boolean userCorrect = true;
        String correctAnswer;

        while (userCorrect && answersCount <= winCondition) {
            if (answersCount == winCondition) {
                System.out.println("Congratulations, " + name + "!");
            } else {
                System.out.print("Question: ");
                correctAnswer = obtainAnswer(type);
                System.out.print("Your answer: ");
                var answer = sc.nextLine();

                if (answer.equals(correctAnswer)) {
                    System.out.println("Correct!");
                } else {
                    System.out.println(answer
                            + " is wrong answer ;(. Correct answer was "
                            + correctAnswer + ".");
                    userCorrect = false;
                }
            }
            answersCount++;
        }
    }

    private static String obtainAnswer(String type) {
        String correctAnswer = switch (type) {
            case "even" -> Even.isEvenGame();
            case "calc" -> Calc.calculate();
            case "GCD" -> Gcd.getGcd();
            case "progression" -> Progression.progression();
            case "prime" -> Prime.obtainPrime();
            default -> "No answer";
        };

        return correctAnswer;
    }
}
