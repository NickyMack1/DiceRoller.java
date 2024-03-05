import java.util.Scanner;
import java.util.Random;

public class DiceRoller {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("How many sides does die 1 have? ");
        int sides1 = scanner.nextInt();
        System.out.print("How many sides does die 2 have? ");
        int sides2 = scanner.nextInt();

        int sum1 = 0, sum2 = 0;
        int rolls = 3;

        for (int i = 0; i < rolls; i++) {
            int roll1 = random.nextInt(sides1) + 1;
            int roll2 = random.nextInt(sides2) + 1;
            System.out.println("Die 1 roll " + (i + 1) + ": " + roll1);
            System.out.println("Die 2 roll " + (i + 1) + ": " + roll2);
            sum1 += roll1;
            sum2 += roll2;
        }

        double average1 = (double) sum1 / rolls;
        double average2 = (double) sum2 / rolls;

        System.out.println("Die 1 rolled a total of " + sum1 + " and rolled " + average1 + " on average.");
        System.out.println("Die 2 rolled a total of " + sum2 + " and rolled " + average2 + " on average.");

        scanner.close();
    }
}
