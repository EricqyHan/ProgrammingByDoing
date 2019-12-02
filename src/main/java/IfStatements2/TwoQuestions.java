package IfStatements2;

import java.util.Scanner;

public class TwoQuestions {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        String Q1, Q2;

        System.out.println("Think of an object and I'll try to guess it.");
        System.out.println(" ");

        System.out.println("Question 1) Is it an animal, vegetable, or mineral?");
        Q1 = userInput.nextLine();

        System.out.println("");

        System.out.println("Question 2) Is it bigger than a breadbox?");
        Q2 = userInput.nextLine();

        if(Q2.equals("yes")) {
            if (Q1.equals("animal")) {
                System.out.println("My guess is that you are thinking about a moose");
            } else if (Q1.equals("vegetable")) {
                System.out.println("My guess is that you are thinking of a watermelon");
            } else if (Q1.equals("mineral")) {
                System.out.println("My guess is that you are thinking of a Camaro");
            }
        } else if (Q2.equals("no")) {
            if(Q2.equals("no")){
                if(Q2.equals("animal")){
                    System.out.println("My guess is that you are thinking of a squirrel");
                } else if (Q2.equals("vegetable")){
                    System.out.println("My guess is that you are thinking of a carrot");
                } else if (Q2.equals("mineral")){
                    System.out.println("My guess is that you are thinking of a paper clip.");
                }
            }
            System.out.println("I would ask you if I'm right but I don't care.");
        }





//        if (Q2 == "yes".toLowerCase()) {
//            if (Q1 == "animal")
//            {
//                System.out.println("My guess is moose");
//                System.out.println("I would ask you if I'm right, but I don't really care. ");
//            }
//            else if (Q1 == "vegetable")
//            {
//                System.out.println("My guess is watermelon");
//                System.out.println("I would ask you if I'm right, but I don't really care. ");
//            }
//            else if (Q1 == "mineral")
//            {
//                System.out.println("My guess is Camaro");
//                System.out.println("I would ask you if I'm right, but I don't really care. ");
//            }
//        } else if (Q2 == "no".toLowerCase()){
//            if (Q1 == "animal")
//            {
//                System.out.println("My guess is squirrel");
//                System.out.println("I would ask you if I'm right, but I don't really care. ");
//            }
//            else if (Q1 == "vegetable")
//            {
//                System.out.println("My guess is carrot");
//                System.out.println("I would ask you if I'm right, but I don't really care. ");
//            }
//            else if (Q1 == "mineral")
//            {
//                System.out.println("My guess is paper clip");
//                System.out.println("I would ask you if I'm right, but I don't really care. ");
//            }
//        }
    }
}
