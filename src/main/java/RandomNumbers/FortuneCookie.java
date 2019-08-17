package RandomNumbers;

import java.util.Random;

public class FortuneCookie {
    public static void main(String[] args) {

        Random random = new Random();

        String[] fortuneCookieFortunes = {"If you don't program in life, life will program you.",
                "Learning is hard work, but everything you learn is yours and will make subsequent learning easier",
                "When actions grow unprofitable, gather information; when information grows unprofitable, sleep.",
                "You can never understand everything. But, you should push yourself to understand the system.",
                "Dead lift - Pick it up and put it down.",
                "Fall down seven times, get up eight.",
                "Experience is the name everyone gives to their mistakes."
        };

        String randomFortune = fortuneCookieFortunes[new Random().nextInt(fortuneCookieFortunes.length)];

        int randomNum1 = random.nextInt(100) + 0;
        int randomNum2 = random.nextInt(100) + 0;
        int randomNum3 = random.nextInt(100) + 0;
        int randomNum4 = random.nextInt(100) + 0;
        int randomNum5 = random.nextInt(100) + 0;
        int randomNum6 = random.nextInt(100) + 0;

        System.out.println("Fortune cookie says: " + randomFortune);

        System.out.println("Your lucky numbers are...");
        System.out.println(randomNum1 + " - " + randomNum2 + " - " + randomNum3 + " - " + randomNum4 + " - " + randomNum5 + " - " + randomNum6);
    }

}

