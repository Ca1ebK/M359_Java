package U4_Iteration.Homework;

import java.util.Scanner;

public class CoinPartTwo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What are we playing up to: ");
        int numPlays = input.nextInt();
        Coin myCoin = new Coin();

        int maxHeadStreak = 0;
        int currentHeadStreak = 0;
        int maxTailStreak = 0;
        int currentTailStreak = 0;

        for (int i = 0; i < numPlays; i++) {

            System.out.println(myCoin);

            if (myCoin.isHeads()) {
                currentHeadStreak++;
                currentTailStreak = 0;
            }
            else {
                currentTailStreak++;
                currentHeadStreak = 0;
            }
            if (currentHeadStreak > maxHeadStreak) {
                maxHeadStreak = currentHeadStreak;
            }
            if (currentTailStreak > maxTailStreak) {
                maxTailStreak = currentTailStreak;
            }

            myCoin.flip();

        }

        System.out.println("Maximum head streak: " + maxHeadStreak);
        System.out.println("Maximum tail streak: " + maxTailStreak);



    }
}
