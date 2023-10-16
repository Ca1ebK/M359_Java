package U4_Iteration.Homework;

import java.util.Scanner;

public class CoinPartOne {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What are we playing up to: ");
        int numPlays = input.nextInt();
        Coin myCoin = new Coin();

        int numHeads = 0;
        int numTails = 0;

        while (numHeads < numPlays && numTails < numPlays) {
            System.out.println(myCoin);
            if (myCoin.isHeads()) {
                numHeads++;
            }
            else {
                numTails++;
            }
            myCoin.flip();
        }

        System.out.println();
        if (numTails > numHeads) {
            System.out.println("TAILS WINS!!!");
        }
        else {
            System.out.println("HEADS WINS!!!");
        }
        System.out.println("Heads: " + numHeads);
        System.out.println("Tails: " + numTails);
    }

}
