package U4_Iteration.Homework;

public class ChallengingLoops_4_5 {
    public static void main(String[] args) {
//        int n = 5;
//        while (n > 0) {
//            for (int i = 1; i <= n; i++) {
//                System.out.print(i);
//            }
//            System.out.println();
//            n--;
//        }

//        int a = 5;
//        while (a > 0) {
//            for (int i = 0; i < a; i++) {
//                System.out.print(a);
//            }
//            System.out.println();
//            a--;
//        }

        everyOtherPyramid("FremdVikings");

        // everyOtherWordBackwards("Boy these loops are tricky!");

    }

    // FremdVikings
    // Fediig
    // Fdi
    // Fi
    // F

    public static void everyOtherPyramid(String str) {

        System.out.println(str); // print the original string
        String newStr = ""; // output string
        int n = str.length();
        while (n > 0) { // keep running until we get to the first character

            for (int i = 0; i < str.length(); i += 2) { // every other letter of str
                newStr += str.charAt(i); // add the character to newStr
            }
            str = newStr; // set str equal to newStr
            System.out.println(newStr); // print the new output
            newStr = "";

            n--;

            if (str.length() == 1) {
                n = 0;
            }
        }

    }

    public static void everyOtherWordBackwards(String str) {

        while (str.length() > 0) {
            // find a space
            int loc = str.indexOf(" ");
            // isolate the word before the space
            String word = "";
            if (loc != -1) {
                word = str.substring(0, loc);    // [0, loc)
            }
            else {
                word = str;
                str = ""; // end the loop
            }

            // reverse the letters
            for (int i = word.length() - 1; i >= 0; i--) {
                System.out.print(word.charAt(i));     // word.substring(i, i+1)
            }
            System.out.print(" ");
            str = str.substring(loc + 1);   // starts AFTER the space
        }

    }

}
