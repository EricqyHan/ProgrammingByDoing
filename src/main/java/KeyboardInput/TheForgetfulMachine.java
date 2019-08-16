package KeyboardInput;

import java.util.Scanner;

public class TheForgetfulMachine {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        String word;
        int number;

        System.out.println("Give me a word");
        word = myScanner.next();

        System.out.println("Give me another word");
        word = myScanner.next();

        System.out.println("Great, now your favorite number? ");
        number = myScanner.nextInt();

        System.out.println("And your second favorite number?");
        number = myScanner.nextInt();



    }
}
