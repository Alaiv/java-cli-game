package hexlet.code;

import games.Calc;
import games.Even;
import games.Gcd;

import java.util.Scanner;

public class Engine {
    public static void questions(String name, String type) {
        Scanner sc = new Scanner(System.in);
        int answersCount = 0;
        final var winCondition = 3;
        boolean userCorrect = true;
        var correctAnswer = "";

        while (userCorrect && answersCount <= winCondition) {
            if (answersCount == winCondition) {
                System.out.println("Congratulations, " + name + "!");
            } else {
                switch (type) {
                    case "even":
                        correctAnswer = Even.isEvenGame();
                        break;
                    case "calc":
                        correctAnswer = Calc.calculate();
                        break;
                    case "GCD":
                        correctAnswer = Gcd.getGcd();
                        break;
                    default:
                        correctAnswer = "No answer";
                }

                System.out.print("Your answer: ");
                var answer = sc.nextLine();

                if (answer.equals(correctAnswer)) {
                    System.out.println("Correct!");
                } else {
                    System.out.println(answer + " is wrong answer ;(. Correct answer was " + correctAnswer + ".");
                    userCorrect = false;
                }
            }
            answersCount++;
        }
    }
}
