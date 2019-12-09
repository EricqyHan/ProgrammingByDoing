package ForLoop;

import java.util.Scanner;

public class CountingWithForLoop {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Type in a message, and I'll display it five times.");
        System.out.println("Message: ");
        String message = userInput.next();

        for(int n = 1; n <= 5; n = n+1)
        {
            System.out.println(n + ". " + message);
        }

    }
}