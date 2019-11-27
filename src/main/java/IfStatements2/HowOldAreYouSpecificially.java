package IfStatements2;

import java.util.Scanner;

public class HowOldAreYouSpecificially {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        String name;
        int age;

        System.out.println("Hey, what's your name? (Sorry, I keep forgetting.");
        name = userInput.nextLine();

        System.out.println("Ok, " + name + ", how old are you?");
        age = userInput.nextInt();

        if (age < 16)
        {
            System.out.println("You can't drive");
        } else if (age == 16 || age == 17)
        {
            System.out.println("You can drive but not vote");
        } else if (age >= 18 && age <= 24)
        {
            System.out.println("You can vote but not rent a car.");
        }
        else if (age >= 25){
            System.out.println("you can do pretty much everything");
        }
    }
}
