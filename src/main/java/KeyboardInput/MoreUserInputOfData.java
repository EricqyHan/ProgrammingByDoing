package KeyboardInput;

import java.util.Scanner;

public class MoreUserInputOfData {

    public static void main(String[] args) {
        System.out.println("Please enter the following info so I can sell it for profit!");

        Scanner myScanner = new Scanner(System.in);

        String firstName;
        System.out.println("First Name");
        firstName = myScanner.next();

        String lastName;
        System.out.println("Last Name");
        lastName = myScanner.next();

        int grade;
        System.out.println("Grade");
        grade = myScanner.nextInt();

        String studentId;
        System.out.println("Student ID");
        studentId = myScanner.next();

        String login;
        System.out.println("Login");
        login = myScanner.next();

        double gpa;
        System.out.println("GPA");
        gpa = myScanner.nextDouble();


        System.out.println("Your information.");
        System.out.println("Login: " + login);
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + firstName + " " +  lastName);
        System.out.println("GPA: " + gpa);
        System.out.println("GPA: " + grade);



    }
}
