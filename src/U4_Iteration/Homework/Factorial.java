package U4_Iteration.Homework;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int n = input.nextInt();
        int factorial = 1;
        if (n < 0) {
            while (n < 0) {
                System.out.print("Please enter a non-negative number: ");
                n = input.nextInt();
            }
        }
        if (n > 0) {
            while (n > 0) {
                factorial *= n;
                n--;
            }
            System.out.println("The factorial is " + factorial);
        }
        else {
            System.out.println(1);
        }
    }
}
