package IfStatements;

import java.util.Scanner;

public class ALittleQuiz {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        String readyForQuiz;
        int score = 0;
        int a1, a2, a3;


        System.out.println("Are you ready for a quiz?");
        readyForQuiz = myScanner.next();

        System.out.println("What is the capital of Alaska?");
        System.out.println("1) Melbourne ");
        System.out.println("2) Anchorage ");
        System.out.println("3) Juneau ");

        a1 = myScanner.nextInt();
        System.out.println();
        if (a1 == 3) {
            System.out.println("That is the right answer!");
            score++;
        } else {
            System.out.println("Sorry, that is the wrong answer. The correct answer is Juneau.");
        }

        System.out.println();
        System.out.println("Can you store the value of \"cat\" in a variable of type int?");
        System.out.println("1) yes ");
        System.out.println("2) no ");

        a2 = myScanner.nextInt();
        System.out.println();
        if (a2 == 2) {
            System.out.println("That is the right answer!");
            score++;
        } else {
            System.out.println("Sorry, \"cat\" is a string. Only ints can store numbers.");
        }

        System.out.println();
        System.out.println("What is the result of 9+6/3?");
        System.out.println("1) 5 ");
        System.out.println("2) 11 ");
        System.out.println("3) 15/3 ");

        a3 = myScanner.nextInt();
        System.out.println();
        if (a3 == 2) {
            System.out.println("That is the right answer!");
            score++;
        } else {
            System.out.println("Sorry, that is the wrong answer. The correct answer is 11.");
        }


        System.out.println("Overrall, you got a " + score + " out of 3 correct.");
        System.out.println("Thanks for playing");
    }
}
