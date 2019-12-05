package WhileLoops;

import java.util.Scanner;

public class CountingWithWhileLoop {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Type in a message, and I'll display it five times. ");
        System.out.println("Message: ");
        String message = userInput.nextLine();

        int n = 0;
        while (n < 5)
        {
            System.out.println((n + 1) + ". " + message);
            n++;
        }
    }
}
