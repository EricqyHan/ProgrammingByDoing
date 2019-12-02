package IfStatements2;

import java.util.Scanner;

public class ALittleQuiz {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        String ready4Quiz;
        int q1, q2, q3;
        int score = 0;

        System.out.println("Are you ready for a quiz? Enter \"y\" or \"Y\" ");
        ready4Quiz = userInput.nextLine();

        System.out.println("Here is the quiz.");
        System.out.println("    ");

        System.out.println("Ok, here it comes!");
        System.out.println("Q1) What is the capital of Alaska?");
        System.out.println("1) Melbourne");
        System.out.println("2) Anchorage");
        System.out.println("3) Juneau");

        q1 = userInput.nextInt();
        if(q1 == 3){
            System.out.println("That is correct!");
            score++;
        } else {
            System.out.println("That is incorrect.");
        }

        System.out.println("Q2) Can you store the value \"cat\" in a variable of type int?");
        System.out.println("1) yes");
        System.out.println("2) no");


        q2 = userInput.nextInt();
        if(q2 == 1){
            System.out.println("Sorry, \"cat\" in a string. Ints can only store numbers.");
        } else {
            System.out.println("That is correct!");
            score++;
        }

        System.out.println("Q3) What is the result of 9+6/3?");
        System.out.println("1) 5");
        System.out.println("2) 11");
        System.out.println("3) 15/3");

        q3 = userInput.nextInt();
        if(q3 == 2) {
            System.out.println("That is correct!");
            score++;
        } else {
            System.out.println("That is incorrect.");
        }

        System.out.println("Overrall, you got " + score + " out of 3 correct.");
        System.out.println("Thanks for playing.");

    }
}
