package U4_Iteration.Homework;

import java.util.Scanner;

public class CoinPartTwo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What are we playing up to: ");
        int numPlays = input.nextInt();
        Coin myCoin = new Coin();

        int numHeads = 0;
        int numTails = 0;

        int maxHeadStreak = 0;
        int currentHeadStreak = 0;
        int maxTailStreak = 0;
        int currentTailStreak = 0;


        for (int i = 0; i < numPlays; i++) {

            System.out.println(myCoin);
            boolean previousCoin = myCoin.isHeads();
            myCoin.flip();

            if (myCoin.isHeads() && previousCoin) {
                currentHeadStreak++;
            }
            else if (myCoin.isHeads() && !previousCoin) {
                currentHeadStreak = 1;
            }

            if (currentHeadStreak > maxHeadStreak) {
                maxHeadStreak = currentHeadStreak;
            }

            if (!myCoin.isHeads() && !previousCoin) {
                currentTailStreak++;
            }
            else if (!myCoin.isHeads() && previousCoin) {
                currentTailStreak = 1;
            }

            if (currentTailStreak > maxTailStreak) {
                maxTailStreak = currentTailStreak;
            }
        }

        System.out.println("Current head streak: " + currentHeadStreak);
        System.out.println("Maximum head streak: " + maxHeadStreak);

        System.out.println("Current tail streak: " + currentTailStreak);
        System.out.println("Maximum tail streak: " + maxTailStreak);


}}
