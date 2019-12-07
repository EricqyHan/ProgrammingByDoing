package DoWhileLoop;

import java.sql.SQLOutput;
import java.util.Random;

public class ShorterDoubleDice {

    public static void main(String[] args) {
        Random random = new Random();

        int roll1, roll2;
//        int roll1 = 1 + random.nextInt(6);
//        int roll2 = 1 + random.nextInt(6);
//        int total = roll1 + roll2;


        System.out.println("Here comes the DICE!");


        do{
            roll1 = 1+ random.nextInt(6);
            roll2 = 1+ random.nextInt(6);
            int total = roll1 + roll2;

            System.out.println("Roll #1: " + roll1);
            System.out.println("Roll #2: " + roll2);
            System.out.println("The total is " + total);
            System.out.println("\n");


        } while(roll1 != roll2);


    }
}
