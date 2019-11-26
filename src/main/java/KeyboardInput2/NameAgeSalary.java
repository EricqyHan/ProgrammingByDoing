package KeyboardInput2;

import java.util.Scanner;

public class NameAgeSalary {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        String name;
        int age;
        double salary;

        System.out.println("Hello. What is your name?");
        name = userInput.next();

        System.out.println("Hi " + name + ". How old are you?");
        age = userInput.nextInt();

        System.out.println("So you're " + age + " eh? That's not old at all!");
        System.out.println("How much do you make, " + name + "?");
        salary = userInput.nextDouble();

        System.out.println(salary + "I hope that is per hour and not a year.");


    }
}
