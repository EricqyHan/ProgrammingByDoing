package IfStatements2;

import java.util.Scanner;

public class SpaceBoxing {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        double weight;
        int planet;

        System.out.println("Please enter your current earth weight: ");
        weight = userInput.nextDouble();

        System.out.println("I have information for the following planets: ");
        System.out.println("1. Venus   2. Mars    3. Jupiter");
        System.out.println("4. Saturn  5. Uranus  6. Neptune");
        planet = userInput.nextInt();

        if (planet == 1)
        {
            System.out.println(weight * 0.78);
        }
        else if (planet == 2)
        {
            System.out.println(weight * .39);
        }
        else if (planet == 3)
        {
            System.out.println(weight * 2.65);
        }
        else if (planet == 4)
        {
            System.out.println(weight * 1.17);
        }
        else if (planet == 5)
        {
            System.out.println(weight * 1.05);
        }
        else if (planet == 6)
        {
            System.out.println(weight * 1.23);
        }
    }
}
