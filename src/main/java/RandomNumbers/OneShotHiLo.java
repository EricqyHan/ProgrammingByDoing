package RandomNumbers;

import java.util.Random;
import java.util.Scanner;

public class OneShotHiLo {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner userInput = new Scanner(System.in);

        int userGuess;
        int myNumber = 1 + random.nextInt(100);

        System.out.println("I'm thinking of a number between 1 and 100. Try to guess it.");
        userGuess = userInput.nextInt();

        if(userGuess == myNumber){
            System.out.println("You guessed it! What are the odds?");
        } else {
            System.out.println("Sorry, you are too high. I was thinking of " + myNumber + ".");
        }


    }
}
