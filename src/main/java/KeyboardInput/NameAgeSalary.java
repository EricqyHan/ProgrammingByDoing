package KeyboardInput;

import java.util.Scanner;

public class NameAgeSalary {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        String name;
        int age;
        int salary;

        System.out.println("Hello. What is your name? ");
        name = myScanner.next();

        System.out.println("Hi " + name + ", How old are you?");
        age = myScanner.nextInt();

        System.out.println("So your're " + age + " eh? That's not old at all! ");
        System.out.println("How much do you make, " + name + " ?");
        salary = myScanner.nextInt();

       if (salary > 100){
           System.out.println("Wow you make a lot");
       } else if (salary < 100 && salary > 0) {
           System.out.println("I hope that's per hour and not per year");
        } else {
           System.out.println("I'm sorry that you are unemployed.");
       }

    }
}
