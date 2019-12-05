package WhileLoops;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingCounter {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        Random random = new Random();

        int myNumber = 1 + random.nextInt(10);
        int yourGuess;
        int guesses = 0;

        System.out.println("I'm thinking about a number betwen 1 and 10");
        yourGuess = userInput.nextInt();
        guesses++;

        while(yourGuess != myNumber)
        {
            System.out.println("\nThat is incorrect. Guess again!");
            yourGuess = userInput.nextInt();
            guesses++;
        }
        System.out.println("That's right! You're a good guesser.");
        System.out.println("It only took you "  + guesses);




    }
}
