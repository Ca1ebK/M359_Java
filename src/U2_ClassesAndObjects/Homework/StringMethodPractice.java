package U2_ClassesAndObjects.Homework;

import java.util.Scanner;

public class StringMethodPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a phrase: "); // The String Class is my favorite class.
        String phrase1 = input.nextLine();
        System.out.print("What character number do you want: "); // 13
        int character = input.nextInt();
        System.out.println("Character " + character + " is: " + phrase1.substring(character, character+1));
        input.nextLine();
        System.out.print("Please enter a phrase: "); // Computer Programming is my favorite class.
        String phrase2 = input.nextLine();
        System.out.println("Comparing the two strings: " + phrase1.compareTo(phrase2));
        System.out.println("Concatenating the two strings: " + phrase1 + phrase2);
        System.out.println("Does the first phrase equal the second phrase? (case sensitive) " + phrase1.equals(phrase2));
        System.out.println("Does the first phrase equal the second phrase? (ignoring cases) " + phrase1.equalsIgnoreCase(phrase2));
        System.out.print("What letter are you looking for in the first phrase: "); // "c"
        String letter = input.nextLine();
        System.out.println(letter + " first occurs at: " + phrase1.indexOf(letter));
        System.out.print("What letter do you want replaced with the letter x: "); // i
        String replacement = input.nextLine();
        System.out.println("The new phrase is: " + phrase1.replace(replacement, "x"));
        System.out.print("What substring do you want (put a space in between the number): "); // "8 25"
        String aSubstring = input.nextLine();
        int space = aSubstring.indexOf(" ");
        int firstSub = Integer.parseInt(aSubstring.substring(0,space));
        int secondSub = Integer.parseInt(aSubstring.substring(space+1));
        System.out.println("Substring returned: " + phrase1.substring(firstSub, secondSub));
        System.out.print("Starting at what number do you want to start a substring that goes to the end of the phrase: ");
        Integer endOfPhrase = Integer.parseInt(input.nextLine());
        System.out.println(phrase1.substring(endOfPhrase));
        System.out.println("Lowercase: " + phrase1.toLowerCase());
        System.out.println("Uppercase: " + phrase1.toUpperCase());
    }
}
