package WhileLoops;

import java.util.Scanner;

public class PINLockout {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int pin = 12345;
        int tries = 0;

        System.out.println("Wielcome to the Bank of Han");
        System.out.println("Enter your PIN");
        int entry = userInput.nextInt();
        tries++;

        while(entry != pin && tries < 3)
        {
            System.out.println("\nIncorrect PIN. Try again");
            System.out.println("Enter your PIN: ");
            entry = userInput.nextInt();
            tries++;
        }

        if (entry == pin)
            System.out.println("\n PIN ACCEPTED. You now have access to your account");
        else if (tries >= 3)
            System.out.println("\n You have run out of tries. Account locked. ");
    }
}
