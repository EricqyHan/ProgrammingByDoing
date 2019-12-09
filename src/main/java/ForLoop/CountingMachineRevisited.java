package ForLoop;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CountingMachineRevisited {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Count from: ");
        int userCountFrom = userInput.nextInt();

        System.out.println("Count to: ");
        int userNumber = userInput.nextInt();

        System.out.println("Count by: ");
        int userCountBy = userInput.nextInt();

        for(int n = userCountFrom; n<= userNumber; n=userCountBy)
        {
            System.out.println(n);
        }
    }
}
