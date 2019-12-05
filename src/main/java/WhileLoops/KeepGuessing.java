package WhileLoops;

import java.util.Random;
import java.util.Scanner;

public class KeepGuessing {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        Random random = new Random();

        int randomNumber = 1 + random.nextInt(10);
        System.out.println("random number " + randomNumber);
        String userGuess;

        System.out.println("I have chosen a number between 1 and 10. Try to guess it.");
        System.out.println("Your guess: ");
        int entry = userInput.nextInt();


        while (entry != randomNumber)
        {
            System.out.println("That guess is incorrect. Guess again");
            entry = userInput.nextInt();
        }
        System.out.println("That's right. You are a good guesser. ");

    }
}
