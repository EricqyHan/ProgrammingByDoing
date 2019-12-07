package DoWhileLoop;

import java.util.Random;
import java.util.Scanner;

public class AgainWithNumberGuessing {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner userInput = new Scanner(System.in);

        System.out.println("I have chosen a number between 1 and 10. " +
                "Try to guess it. ");

        int yourGuess;
        int myNumber = 1 + random.nextInt(10);
        int guesses = 0;
        System.out.println("Shhhh! My number is " + myNumber);

        do {
            System.out.println("Your guess: ");
            yourGuess = userInput.nextInt();
            guesses++;

        } while(myNumber != yourGuess);
        System.out.println("That's right. You are a good guesser.");
        System.out.println("It only took you " + guesses);
    }
}
