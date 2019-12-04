package RandomNumbers;

import java.util.Random;

public class Randomness {
    public static void main(String[] args) {
        Random random = new Random();

        int x = 1 + random.nextInt();

        System.out.println(1 + random.nextInt(4) + 4);


    }
}
