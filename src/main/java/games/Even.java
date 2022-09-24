package games;

import hexlet.code.Engine;
import org.apache.commons.lang3.RandomUtils;

public class Even {
    public static void isEven(String name) {
        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");
        Engine.questions(name, "even");
    }

    public static String isEvenGame() {
        final var randomNumber = RandomUtils.nextInt(1, 100);
        var rightAnswer = randomNumber % 2 == 0 ? "yes" : "no";
        System.out.print("Question: ");
        System.out.println(randomNumber);
        return rightAnswer;
    }
}
