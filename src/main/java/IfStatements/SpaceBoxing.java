package IfStatements;

import java.util.Scanner;

public class SpaceBoxing {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        double weight;
        double planet;


        System.out.println("Please enter your current earth weight.");
        weight = myScanner.nextDouble();

        System.out.println("I have information for the following planets.");
        System.out.println("1. Venus   2. Mars     3. Saturn");
        System.out.println("4. Saturn  5. Uranus   6. Neptune");
        System.out.println("Which planet are you visiting?");
        planet = myScanner.nextInt();



        if (planet == 1) {
            weight = weight * 0.78;
            System.out.println("Your weight would be " + weight + " pounds on Venus.");
        } else if (planet == 2){
            weight = weight * 0.39;
            System.out.println("Your weight would be " + weight + " pounds on Mars.");
        } else if (planet == 3) {
            weight = weight * 2.65;
            System.out.println("Your weight would be " + weight + " pounds on Jupiter.");
        } else if (planet == 4) {
            weight = weight * 1.17;
            System.out.println("Your weight would be " + weight + " pounds on Saturn.");
        } else if (planet == 5) {
            weight = weight * 1.05;
            System.out.println("Your weight would be " + weight + " pounds on Uranus.");
        } else if (planet == 6) {
            weight = weight * 1.23;
            System.out.println("Your weight would be " + weight + " pounds on Neptune.");
        } else {
            System.out.println("Invalid entry.");
        }

    }
}
