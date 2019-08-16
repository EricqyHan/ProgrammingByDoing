package IfStatements;

import java.util.Scanner;

public class WeekdayName {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);
        System.out.println("What day of the week is today?");

        int number;
        number = myscanner.nextInt();

        if (number == 1){
            System.out.println("Today is Sunday");
        } else if (number == 2) {
            System.out.println("Today is Monday");
        } else if (number == 3) {
            System.out.println("Today is Tuesday");
        } else if (number == 4) {
            System.out.println("Today is Wednesday");
        } else if (number == 5) {
            System.out.println("Today is Thursday");
        } else if (number == 6) {
            System.out.println("Today is Friday");
        } else if (number == 7 || number == 0) {
            System.out.println("Today is Saturday");
        } else {
            System.out.println("Error");
        }

    }
}
