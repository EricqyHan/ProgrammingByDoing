package IfStatements2;

import java.util.Scanner;

public class WeekdayName {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter a day of the week");
        int dayOfWeek;
        dayOfWeek = userInput.nextInt();

        if (dayOfWeek == 1){
            System.out.println("Weekday 1: Sunday");
        } else if (dayOfWeek == 2){
            System.out.println("Weekday 2: Monday");
        } else if (dayOfWeek == 3) {
            System.out.println("Weekday 3: Tuesday");
        } else if (dayOfWeek == 4) {
            System.out.println("Weekday 4: Wednesday");
        } else if (dayOfWeek == 5) {
            System.out.println("Weekday 5: Thursday");
        } else if (dayOfWeek == 6) {
            System.out.println("Weekday 6: Friday");
        } else if (dayOfWeek == 7) {
            System.out.println("Weekday 7: Saturday");
        } else if (dayOfWeek == 0) {
            System.out.println("Weekday 0: Saturday");
        } else {
            System.out.println("error");
        }


    }
}
