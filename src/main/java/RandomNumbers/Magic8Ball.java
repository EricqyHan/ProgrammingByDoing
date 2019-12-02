package RandomNumbers;

import java.util.Random;
import java.util.Scanner;

public class Magic8Ball {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner userInput = new Scanner(System.in);

        String yesNo;

        System.out.println("Do you have a question for the magic 8-Ball?");
        yesNo = userInput.nextLine();

        if(yesNo)

        int choice = 1 + random.nextInt(15);
        String response = "";

        if(choice == 1) response = "It is certain.";
        else if (choice == 2) response = "It is decidely so";
        else if (choice == 3) response = "Without a doubt";
        else if (choice == 4) response = "Yes - definitely";
        else if (choice == 5) response = "You may rely on it";
        else if (choice == 6) response = "As I see it, yes";
        else if (choice == 7) response = "Most likely";
        else if (choice == 8) response = "Outlook good";
        else if (choice == 9) response = "Signs point to yes";
        else if (choice == 10) response = "Yes";
        else if (choice == 11) response = "Reply hazy, try again";
        else if (choice == 12) response = "Ask again later";
        else if (choice == 13) response = "Better not tell you now";
        else if (choice == 14) response = "Cannot predict now";
        else if (choice == 15) response = "Concentrate and ask again";
        else response = "Error";

        System.out.println("Magic 8-ball says: " + response);
    }
}
