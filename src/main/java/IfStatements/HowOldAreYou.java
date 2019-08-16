package IfStatements;

import java.util.Scanner;

public class HowOldAreYou {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        int age;

        System.out.println("How old are you?");
        age = myScanner.nextInt();

        if (age < 16) {
            System.out.println("You can't drive");
        } else if (age == 16 || age == 17) {
            System.out.println("You can't vote.");
        } else if (age >= 18 && age <= 24) {
            System.out.println("You can't rent a car.");
        } else if (age >= 25) {
            System.out.println("You can do anything legal");
        }
    }
}
