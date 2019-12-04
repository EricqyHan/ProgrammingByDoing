package WhileLoops;

import java.util.Scanner;

public class EnterYourPin {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int pin = 12345;

        System.out.println("Welcome to the Bank of HAN");
        System.out.println("Enter your PIN");
        int entry = keyboard.nextInt();

        while (entry != pin)
        {
            System.out.println("\nIncorrect PIN. TRY AGAIN");
            System.out.println("Enter your PIN: ");
            entry = keyboard.nextInt();
        }

        System.out.println("\nPIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT!");

    }
}
