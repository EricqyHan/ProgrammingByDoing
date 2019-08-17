package GUI;

import java.sql.SQLOutput;
import java.time.Period;
import java.util.Scanner;

public class TwentyQuestionsWellActuallyTwo {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        String q1;
        String q2;
        String question = " ";

        System.out.println("Two Question:");
        System.out.println("Think of an object, and I will try to guess it.");

        System.out.println("Question 1) Is it an animal, vegetable, or mineral");
        q1 = myScanner.next();

        System.out.println("Question 2) It it bigger than a breadbox?");
        q2 = myScanner.next();


        if (q1.equalsIgnoreCase("animal")){
            if (q2.equalsIgnoreCase("no")) {
                question = "squirrel";
            } else {
                question = "Moose";
            }
        } else if (q1.equalsIgnoreCase("vegetable")) {
            if (q2.equalsIgnoreCase("no")) {
                question = "carrot";
            } else {
                question = "watermelon";
            }
        } else if (q1.equalsIgnoreCase("mineral")) {
            if (q1.equalsIgnoreCase("no")) {
                question = "paper clip";
            } else {
                question = "Camaro";
            }
        }

        if (question == "") {
            System.out.println("Answer not valid. Please try again.");
        } else {
            System.out.println("My guess is that you are thinking of a " + question + ".");
            System.out.println("Am I right?");
        }

    }
}
