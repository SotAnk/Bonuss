public class Main {
    public static void main(String[] args) {
        int startAccount = 100;
        int bonusRuble = 100;
        int toppedAccount = 100;
        int toppedAccount2 = 1100;
        int finalAccount = startAccount + toppedAccount2;
        int bonus;

        if (toppedAccount2 > 1000) {
            bonus = toppedAccount2 / bonusRuble;
        } else {
            bonus = 0;
        }

        int finalScore = startAccount + toppedAccount2 + bonus;

        System.out.println("Final Score = " + finalScore);
    }
}
