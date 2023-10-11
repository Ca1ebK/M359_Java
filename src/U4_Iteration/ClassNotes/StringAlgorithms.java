package U4_Iteration.ClassNotes;

public class StringAlgorithms {
    public static void main(String[] args) {

        // PART I
        String mySchool = "Fremd Vikings";

        // print every other character of mySchool on the same line

        for (int i = 0; i < mySchool.length(); i += 2) {
            System.out.print(mySchool.charAt(i));
        }

        // print the String mySchool in reverse (all characters on the same line)

        System.out.println("");

        for (int i = mySchool.length() - 1; i >= 0; i--) {
            System.out.print(mySchool.charAt(i));
        }



         /* PART II
           Given the String animal, print the output such that the first line shows
           the first character, the second line shows the second character, and so on

           Ex:  If animal = "monkey" then the output would be:
               m
               mo
               mon
               monk
               monke
               monkey
        */

        String animal = "monkey";
        for (int i = 0; i <= animal.length(); i++) {
            System.out.println(animal.substring(0, i));
        }

        System.out.println("");
        // PART III
        String phrase = "Mary had a little lamb, little lamb, little lamb";
        phrase += "Mary had a little lamb, its fleece was white as snow";

        // Print the amount of times the word "little" appears within phrase?

        int numLittle = 0;
        for (int i = 0; i < phrase.length() - 5; i++) {
            if (phrase.substring(i, i+6).equals("little")) {
                numLittle++;
            }
        }

        System.out.println("The word \"little\" appears in phrase " + numLittle + " times.");

        // create a new String, or modify the existing String, that removes
        // the word "little" entirely

        String newPhrase = phrase.replace("little", "");
        System.out.println(newPhrase);

        // create a new String (based on phrase), or modify the existing String,
        // that replaces the word "little" with the word "BIG"




    }
}