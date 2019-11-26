package KeyboardInput2;

import java.util.Scanner;

public class AgeInFiveYears {
    public static void main(String[] args) {

        String name;
        int age;

        System.out.println("Hello. What is your name?");
        Scanner userInput = new Scanner(System.in);
        name = userInput.nextLine();

        System.out.println("Hi, " + name + " ! How old are you?");
        age = userInput.nextInt();

        System.out.println("Did you know that in five years you will be " +
                (age + 5) + " years old?");

        System.out.println("And five years ago you were " + (age - 5) + "! " +
                "Imagine that!");
    }
}
