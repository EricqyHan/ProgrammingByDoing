package RandomNumbers;

import java.util.Random;

public class Dice {
    public static void main(String[] args) {
        Random random = new Random();

        System.out.println("Here comes the dice!");

        int roll1 = 1 + random.nextInt(6);
        int roll2 = 1 + random.nextInt(6);

        System.out.println("Roll #1: " + roll1);
        System.out.println("Roll #2: " + roll2);

    }
}
