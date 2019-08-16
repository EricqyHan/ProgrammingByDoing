package KeyboardInput;

import java.util.Scanner;

public class ADumbCalculator {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        double d1;
        double d2;
        double d3;

        System.out.println("What is your first number?");
        d1 = myScanner.nextDouble();

        System.out.println("What is your second number?");
        d2 = myScanner.nextDouble();

        System.out.println("What is your third number?");
        d3 = myScanner.nextDouble();

        double total = d1 + d2 + d3;

        System.out.println("The total is " + total + ".");

        double divide = total / 2;

        System.out.println("Average is " + divide + ".");

    }
}
