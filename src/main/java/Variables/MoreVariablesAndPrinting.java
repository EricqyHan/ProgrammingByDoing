package Variables;

public class MoreVariablesAndPrinting {
    public static void main(String[] args) {
        String myName, myEyes, myTeeth, myHair;
        int myAge, myHeight, myWeight;

        myName = "Oric Nah";
        myAge = 29; // I wish I was younger
        myHeight = 74; // inches
        myWeight = 220; // i think
        myEyes = "Black";
        myTeeth = "White";
        myHair = "Black";

        System.out.println("Lets talk about " + myName + ".");
        System.out.println("He's " + myHeight + " inches tall.");
        System.out.println("He's " + myWeight + " pounds heavy.");
        System.out.println("Actually that's very heavy");
        System.out.println("He's got " + myEyes + " eyes and " + myHair + "hair.");
        System.out.println("His teeth are uaually " + myTeeth + " depending on the coffee.");
        System.out.println("If I add " + myAge + " , " + myHeight + ", " + " and " + myWeight + " I get " + (myAge+myHeight+myWeight));

    }
}
