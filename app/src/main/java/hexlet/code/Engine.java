package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.Gcd;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

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
                correctAnswer = obtainAnswer(type);
                var answer = sc.nextLine();

                if (answer.equals(correctAnswer)) {
                    System.out.println("Correct!");
                } else {
                    userCorrect = falseAnswer(answer, correctAnswer, name);
                }
            }
            answersCount++;
        }
    }

    private static boolean falseAnswer(String answer, String correctAnswer, String name) {
        System.out.println(answer
                + " is wrong answer ;(. Correct answer was "
                + correctAnswer + ".");
        System.out.println("Let's try again, " + name + "!");
        return false;
    }

    private static String obtainAnswer(String type) {
        System.out.print("Question: ");
        String correctAnswer = switch (type) {
            case "even" -> Even.isEvenGame();
            case "calc" -> Calc.calculate();
            case "GCD" -> Gcd.getGcd();
            case "progression" -> Progression.progression();
            case "prime" -> Prime.obtainPrime();
            default -> "No answer";
        };
        System.out.print("Your answer: ");
        return correctAnswer;
    }
}
