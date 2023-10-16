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

        int headStreak1 = 0;
        int headStreak2 = 0;
        int tailStreak = 0;
/*
~~Tails
Head
Head
Head
Head
Head
Tail
Head
Head
Head
Tail
Tail
Head
Head
 */

        String coinOutput = "";
        for (int i=0; i<numPlays; i++) {
            coinOutput += myCoin.toString();
            myCoin.flip();
        }
        String currentCoin = "";
        for (int a=0; a<coinOutput.length(); a+=5){
            currentCoin = coinOutput.substring(a,a+5);
            if (currentCoin.equals("Heads")){

            }
        }

        System.out.println(coinOutput);

//        for (int i=0; i<numPlays; i++) {
//            System.out.println(myCoin);
//            boolean previousCoin = myCoin.isHeads();
//            myCoin.flip();
//
//            if (myCoin.isHeads() && !(previousCoin)) {
//                headStreak1++;
//            }
//
//            if (myCoin.isHeads() && previousCoin) {
//                headStreak1++;
//            }
////            else {
////                numTails++;
////            }
//        }
//
//        System.out.println(headStreak);
//    }


}}
