package U2_ClassesAndObjects.Homework;

import java.util.Scanner;

public class MathClass {
    public static void main(String[] args) {
        // Caleb Kang
        // Mrs. Denna
        // Period 8

        // PART I
        Scanner input = new Scanner(System.in);
        System.out.print("Enter x1: ");
        int x1 = input.nextInt();
        System.out.print("Enter y1: ");
        int y1 = input.nextInt();
        System.out.print("Enter x2: ");
        int x2 = input.nextInt();
        System.out.print("Enter y2: ");
        int y2 = input.nextInt();
        double distance = Math.sqrt(Math.pow(y2-y1, 2)+Math.pow(x2-x1, 2));
        System.out.println("The distance between (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ") is " + distance);

        // PART II
        System.out.print("Enter a maximum integer and a minimum integer, separated by a space: ");
        int max = input.nextInt();
        int min = input.nextInt();

        int randInt = (int) ((max-min)*Math.random()) + min;
        System.out.println("A random number between " + min + " and " + max + " is: " + randInt);

        // PART III
        int absValue = Math.abs(-5); System.out.println(absValue);
        double twoSquared = Math.pow(2,2); System.out.println(twoSquared);
        double aMax = Math.max(3.0, 100.0); System.out.println(aMax);
        double aMin = Math.min(3.0, 100.0); System.out.println(aMin);
    }
}
