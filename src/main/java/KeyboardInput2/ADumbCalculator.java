package KeyboardInput2;

import java.util.Scanner;

public class ADumbCalculator {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        double one;
        double two;
        double three;

        System.out.println("What is your first number?");
        one = userInput.nextDouble();

        System.out.println("What is your second number?");
        two = userInput.nextDouble();

        System.out.println("What is your third number?");
        three = userInput.nextDouble();

        System.out.println("(" + one + " + " + two  +"+ "+ three + ")" + " / 2 " + " is ... " + ((one + two + three) /2) );



    }
}
