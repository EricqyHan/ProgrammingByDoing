package IfStatements2;

import java.util.Scanner;

public class HowOldAreYou {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        String name;
        int age;

        System.out.println("Hey, what's your name?");
        name = userInput.nextLine();

        System.out.println("Ok, " + name + " how old are you?");
        age = userInput.nextInt();

        if (age < 16){
            System.out.println("You can't drive " + name + ".");
        }

        if (age == 17  || age == 18){
            System.out.println("You can't vote " + name + ".");
        }

        if (age <= 24){
            System.out.println("You can't rent a car " + name + ".");
        }

        if (age >= 25) {
            System.out.println("You can do whatever you want." + name + ".");
        }


    }
}
