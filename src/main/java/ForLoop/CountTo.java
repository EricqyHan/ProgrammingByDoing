package ForLoop;

import java.util.Scanner;

public class CountTo {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Count to : ");
        int userNumber = userInput.nextInt();
        //String numbString = userInput.nextLine();

        for(int n = 0; n <= userNumber; n++)
        {
            System.out.println(n);
        }
    }
}
