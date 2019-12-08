package DoWhileLoop;

import java.util.Scanner;

public class BabyNim {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String pile;
        int pileA = 3;
        int pileB = 3;
        int pileC = 3;

        System.out.println("A: " + pileA + " B: " + pileB + " C: " + pileC);

        do{
            System.out.println("Choose a pile: ");
            pile = userInput.nextLine();
            if(pile == "a"){
                pileA --;
            } else if (pile == "b"){
                pileB--;
            } else if (pile == "c"){
                pileC--;
            }
            System.out.println("A: " + pileA + " B: " + pileB + " C: " + pileC);
        } while(pileA > 0 && pileB > 0 && pileC > 0);
        System.out.println("A: " + pileA + " B: " + pileB + " C: " + pileC);
    }
}
