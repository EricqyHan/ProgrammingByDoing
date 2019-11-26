package KeyboardInput2;

import java.util.Scanner;

public class MoreUserInputData {
    public static void main(String[] args) {
        System.out.println("Please enter following info so I can sell it for profit.");

        Scanner userInput = new Scanner(System.in);

        String firstName;
        String lastName;
        int grade;
        String studentID;
        String login;
        double gpa;

        System.out.println("First Name:");
        firstName = userInput.next();

        System.out.println("Last Name:");
        lastName = userInput.next();

        System.out.println("Grade:");
        grade = userInput.nextInt();

        System.out.println("Student ID:");
        studentID = userInput.next();

        System.out.println("Login:");
        login = userInput.next();

        System.out.println("GPA");
        gpa = userInput.nextDouble();

        System.out.println("Login: " + login);
        System.out.println("ID:" + studentID);
        System.out.println("Name: " + lastName + ", " + firstName);
        System.out.println("GPA: " + gpa);
        System.out.println("Grade: " + grade);
    }
}
