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

        boolean previousCoin;


        for (int i = 0; i < numPlays; i++) {

            previousCoin = myCoin.isHeads();
            System.out.println(myCoin);
            myCoin.flip();

            if (i == 0) {
                if (previousCoin) {
                    currentHeadStreak = 1;
                }
                else {
                    currentTailStreak = 1;
                }
            }
            else {
                if (myCoin.isHeads() && previousCoin) { // if it's heads and heads
                    currentHeadStreak++;
                }
                else if (myCoin.isHeads() && !previousCoin) { // if it's heads and tails
                    currentHeadStreak = 1;
                }
                else if (!myCoin.isHeads() && !previousCoin) { // if it's tails and tails
                    currentTailStreak++;
                }
                else { // if it's tails and heads
                    currentTailStreak = 1;
                }
            }
            if (currentHeadStreak > maxHeadStreak) {
                maxHeadStreak = currentHeadStreak;
            }
            if (currentTailStreak > maxTailStreak) {
                maxTailStreak = currentTailStreak;
            }
        }

        System.out.println("Current head streak: " + currentHeadStreak);
        System.out.println("Maximum head streak: " + maxHeadStreak);
        System.out.println("Maximum tail streak: " + maxTailStreak);



}}
