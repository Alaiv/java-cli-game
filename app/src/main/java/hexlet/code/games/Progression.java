package hexlet.code.games;

import hexlet.code.Engine;
import org.apache.commons.lang3.RandomUtils;

import java.util.StringJoiner;

public class Progression {

    public static void startProgression() {
        var message = "What number is missing in the progression?";
        Engine.questions("progression", message);
    }

    public static String progression() {
        final var firstNumber = RandomUtils.nextInt(1, 20);
        final var stepsOfProgression = RandomUtils.nextInt(1, 3);
        final var lengthOfProgression = 10;
        final var secondNumber = firstNumber + (lengthOfProgression * stepsOfProgression);
        var progressionStream = new StringJoiner(" ");

        for (int i = firstNumber; i < secondNumber; i += stepsOfProgression) {
            progressionStream.add(Integer.toString(i));
        }

        var splitProgression = progressionStream.toString().split(" ");
        var indexToReplace = RandomUtils.nextInt(0, splitProgression.length - 1);
        var correctAnswer = splitProgression[indexToReplace];
        splitProgression[indexToReplace] = "..";

        System.out.println(String.join(" ", splitProgression));
        return correctAnswer;
    }
}
