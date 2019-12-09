package ForLoop;

import java.util.Scanner;

public class TenTimes {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a message that will be repreated ten times.");
        String message = userInput.nextLine();

        for(int n = 1; n <= 10; n = n+1)
        {
            System.out.println(n + " . " + message);
        }
    }
}
