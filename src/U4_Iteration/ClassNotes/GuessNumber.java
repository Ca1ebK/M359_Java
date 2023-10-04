package U4_Iteration.ClassNotes;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rnd = (int) (Math.random() * 10 + 1);
        System.out.println("Guess a number from 1-10:");

        boolean notGuessed = true;
        int numGuesses = 0;

        while (notGuessed) {
            int num = input.nextInt();
            if (num < rnd) {
                System.out.println("Your guess is too low");
                numGuesses++;
                System.out.println("Guess a number from 1-10:");
            }
            else if (num > rnd) {
                System.out.println("Your guess is too high");
                numGuesses++;
                System.out.println("Guess a number from 1-10:");
            }
            else {
                numGuesses++;
                System.out.println("Congrats! You guessed the number " + num + " in " + numGuesses);
                notGuessed = false;
            }
        }

    }
}
