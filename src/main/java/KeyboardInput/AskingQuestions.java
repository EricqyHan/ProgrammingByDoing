package KeyboardInput;

import java.util.Scanner;

public class AskingQuestions {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        int age;
        String height;
        double weight;

        System.out.println("How old are you?");
        age = myScanner.nextInt();

        System.out.println("How tall are you?");
        height = myScanner.next();

        System.out.println("How much do you weigh?");
        weight = myScanner.nextDouble();


    }

}
