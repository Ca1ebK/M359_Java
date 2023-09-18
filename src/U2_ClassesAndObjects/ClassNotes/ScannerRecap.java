package U2_ClassesAndObjects.ClassNotes;

import java.util.Scanner;

public class ScannerRecap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Give me your favorite number and age, same line: ");
        int num = input.nextInt();
        int age = input.nextInt();  // getting the next num, on
                                    // the same line
        System.out.println("Your favorite number is " + num);
        System.out.println("Your age is: " + age);
        input.nextLine();
        System.out.println("What is your name?");
        String name = input.nextLine();
        System.out.println("Your name is: " + name);
    }
}
