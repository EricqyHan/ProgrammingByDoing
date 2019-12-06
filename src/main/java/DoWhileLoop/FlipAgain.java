package DoWhileLoop;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class FlipAgain {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        Random coinFLip = new Random();

        String again;


        do{
            int flip = coinFLip.nextInt(2);
            String coin;
            if(flip == 1)
                coin = "heads";
            else
                coin = "tails";

            System.out.println("You flip a coin and it is ... ");
            System.out.println("Would you like to flip again? " + coin);
            again = userInput.nextLine();

        } while(again.equals ("y"));
    }
}
