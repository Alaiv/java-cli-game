package games;

import hexlet.code.Engine;
import org.apache.commons.lang3.RandomUtils;

public class Gcd {
    public static void gcd(String name) {
        System.out.println("Find the greatest common divisor of given numbers.");
        Engine.questions(name, "GCD");
    }

    public static String getGcd() {
        final var firstNumber = RandomUtils.nextInt(0, 100);
        final var secondNumber = RandomUtils.nextInt(0, 100);
        var rightAnswer = calculateGcd(firstNumber, secondNumber);
        System.out.print("Question: ");
        System.out.println(firstNumber + " " + secondNumber);
        return Integer.toString(rightAnswer);
    }

    public static int calculateGcd(int first, int second) {
        if (first == second) {
            return first;
        }
        return first % second != 0 ? calculateGcd(second, first % second) : Math.abs(second);
    }
}
