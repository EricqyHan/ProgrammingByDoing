package KeyboardInput2;

import java.util.Scanner;

public class ForgetfulMachine {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        String userPickedWord;
        String secondPickedWord;
        int favNumber;
        int secondFavNumber;

        System.out.println("Give me a word!");
        userPickedWord = userInput.next();

        System.out.println("Give me a second word!");
        secondPickedWord = userInput.next();

        System.out.println("Great, what's your favorite number?");
        favNumber = userInput.nextInt();

        System.out.println("Great, what's your second avorite number?");
        secondFavNumber = userInput.nextInt();

        System.out.println("Whew! Whasn't that fun?");

    }
}
