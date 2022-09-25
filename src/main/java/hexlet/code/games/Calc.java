package hexlet.code.games;

import hexlet.code.Engine;
import org.apache.commons.lang3.RandomUtils;

public class Calc {
    public static void calc() {
        var message = "What is the result of the expression?";
        Engine.questions("calc", message);
    }

    public static String calculate() {
        final var firstNumber = RandomUtils.nextInt(1, 20);
        final var secondNumber = RandomUtils.nextInt(1, 20);
        final var randomOperation = RandomUtils.nextInt(0, 2);
        String[] operations = {"+", "*", "-"};
        var typeOfOperation = operations[randomOperation];
        int correctAnswer;

        if (typeOfOperation.equals("+")) {
            System.out.println(firstNumber + " + " + secondNumber);
            correctAnswer = firstNumber + secondNumber;
        } else if (typeOfOperation.equals("-")) {
            System.out.println(firstNumber + " - " + secondNumber);
            correctAnswer = firstNumber - secondNumber;
        } else {
            System.out.println(firstNumber + " * " + secondNumber);
            correctAnswer = firstNumber * secondNumber;
        }

        return Integer.toString(correctAnswer);
    }
}
