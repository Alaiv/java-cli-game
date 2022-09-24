package even;

import org.apache.commons.lang3.RandomUtils;

import java.util.Scanner;

public class Even {
    public static void isEven(String name) {
        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");
        var answersCount = 0;
        final var winCondition = 3;
        boolean result = true;

        while (result && answersCount <= winCondition) {
            if (answersCount == winCondition) {
                System.out.println("ConCongratulations, " + name + "!");
            } else {
                result = isEvenGame();
            }
            answersCount++;
        }
    }

    public static boolean isEvenGame() {
        Scanner sc = new Scanner(System.in);
        final var randomNumber = RandomUtils.nextInt(1, 100);
        var rightAnswer = randomNumber % 2 == 0 ? "yes" : "no";

        System.out.print("Question: ");
        System.out.println(randomNumber);
        System.out.print("Your answer: ");
        var answer = sc.nextLine();

        if (answer.equals(rightAnswer)) {
            System.out.println("Correct!");
        } else {
            System.out.println(answer + " is wrong answer ;(. Correct answer was " + rightAnswer + ".");
        }

        return answer.equals(rightAnswer);
    }
}
