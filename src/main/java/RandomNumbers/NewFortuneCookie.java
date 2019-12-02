package RandomNumbers;

import java.util.Random;

public class NewFortuneCookie {
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

        int luckyFortuneNum1 = random.nextInt(100) + 0;
        int luckyFortuneNum2 = random.nextInt(100) + 0;
        int luckyFortuneNum3 = random.nextInt(100) + 0;
        int luckyFortuneNum4 = random.nextInt(100) + 0;
        int luckyFortuneNum5 = random.nextInt(100) + 0;
        int luckyFortuneNum6 = random.nextInt(100) + 0;

        System.out.println("Fortune Cookie says: " + randomFortune);

        System.out.println("Your lucky numbers are ... ");
        System.out.println(luckyFortuneNum1 + " - " + luckyFortuneNum2 +  " - " + luckyFortuneNum3 + " - "
        + luckyFortuneNum4 + " - " + luckyFortuneNum5 + " - " + luckyFortuneNum6);
    }
}
