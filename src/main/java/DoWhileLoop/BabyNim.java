package DoWhileLoop;

import java.util.Scanner;

public class BabyNim {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int pileA = 3;
        int pileB = 3;
        int pileC = 3;

        while(pileA > 0 || pileB > 0 || pileC > 0){
            System.out.println("A: " + pileA + " B: " + pileB + " C: " + pileC);
            System.out.println("\r\nChoose a pile: ");
            String pile = userInput.nextLine();

            System.out.println("\r\nHow many to remove from the pile? ");
            int removeNumber = userInput.nextInt();


            if(pile.equals("a")){
                pileA = pileA - removeNumber;
            } else if (pile.equals("b")){
                pileB = pileB - removeNumber;
            } else if (pile.equals("c")){
                pileC = pileC - removeNumber;
            }
            if(pileA <= 0 && pileB <= 0 && pileC <= 0){
                System.out.println("All piles are empty. Good job!");
            }
        }
    }
}
