package hexlet.code.games;

import hexlet.code.Engine;
import org.apache.commons.lang3.RandomUtils;

public class Prime {
    public static void startPrime() {
        var message = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        Engine.questions("prime", message);
    }

    public static String obtainPrime() {
        final var number = RandomUtils.nextInt(1, 100);
        System.out.println(number);
        return checkForPrime(number) ? "yes" : "no";
    }

    private static boolean checkForPrime(int num) {
        var number = Math.sqrt(num);
        for (int i = 2; i <= number; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
