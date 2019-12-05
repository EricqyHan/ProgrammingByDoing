package WhileLoops;

import java.util.Random;

public class DiceDoubles {
    public static void main(String[] args) {
        Random random = new Random();

        int dice1 = 1 + random.nextInt(6);
        int dice2 = 1 + random.nextInt(6);

        System.out.println("Here comes the roll");
        System.out.println("Roll #1: " + dice1);
        System.out.println("Roll #2: " + dice2);
        int total = dice1 + dice2;
        System.out.println("The total is " + total);

        while(dice1 != dice2)
        {
            dice1 = 1 + random.nextInt(6);
            dice2 = 1 + random.nextInt(6);
            System.out.println("\n Roll #1: " + dice1);
            System.out.println(" Roll #2: " + dice2);
            total = dice1 + dice2;

            System.out.println("The total is " + total + "!");


        }
    }
}
