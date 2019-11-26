package KeyboardInput2;

import java.util.Scanner;

public class AskingQuestion {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        int age;
        String height;
        double weight;

        System.out.println("How old are you?");
        age = userInput.nextInt();

        System.out.println("How tall are you? (Enter in Feet + inches)");
        height = userInput.next();

        System.out.println("How much do you weight?");
        weight = userInput.nextDouble();


    }
}
