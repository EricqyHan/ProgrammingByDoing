package RandomNumbers;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner userInput = new Scanner(System.in);

        int myNumber = 1 + random.nextInt(10);
        int guess1;

        System.out.println("I'm thinking about a number between 1 and 10");
        guess1 = userInput.nextInt();

        if(guess1 == myNumber){
            System.out.println("That's right! My secret number was " + myNumber + "!");
        } else {
            System.out.println("Sorry, but I was thinking of " + myNumber + "!");
        }

    }
}
