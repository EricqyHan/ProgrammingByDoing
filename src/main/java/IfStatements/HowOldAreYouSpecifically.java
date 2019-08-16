package IfStatements;

import java.util.Scanner;

public class HowOldAreYouSpecifically {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        String name;
        int age;

        System.out.println("Hey, What is your name? (Sorry, I keep forgetting.)");
        name = myScanner.next();

        System.out.println("Ok, " + name + ", how old are you?");

        age = myScanner.nextInt();

        if (age < 16) {
            System.out.println("You can't drive, " + name + ".");
        } else if (age == 16 || age == 17) {
            System.out.println("You can't vote, " + name + ".");
        } else if (age >= 18 && age <= 24) {
            System.out.println("You can't rent a car, " + name + ".");
        } else if (age >= 25) {
            System.out.println("You can do anything legal, " + name + ".");
        }


    }

}
