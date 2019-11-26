package KeyboardInput2;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        double heightMeters;
        double weightKg;

        System.out.println("Your height in m: ");
        heightMeters = userInput.nextDouble();

        System.out.println("Your weight in kg");
        weightKg = userInput.nextDouble();

        double bmi = (weightKg / (heightMeters * heightMeters));

        System.out.printf("Your BMI is %.4f", bmi);

    }
}
