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

        // everyOtherPyramid("FremdVikings");

        everyOtherWordBackwards("Boy these loops are tricky!");

    }

    // FremdVikings
    // Fediig
    // Fdi
    // Fi
    // F

    public static void everyOtherPyramid(String str) {
        int n = str.length();
        String newStr = "";
        while (n > 0) {
            for (int i = 0; i < str.length(); i += 2) {
                newStr += str.charAt(i);
            }
            System.out.println(newStr);
        n--;
        }
    }

    /*
    Challenge 4:

    Write the method everyOtherWordBackwards that will print every word with its characters reversed.  The order of the words will remain the same, but each word itself is printed backwards.  To call this method inside public static void main, you will need to make this method static as well.  Use this method header:

    public static void everyOtherWordBackwards(String str)

    For the following method call:

    everyOtherWordBackwards("Boy these loops are tricky!");


    You would get this output:

	yoB eseht spool era !ykcirt
     */

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
