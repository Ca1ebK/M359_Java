package U7_ArrayLists.ClassNotes;

public class Test {
    public static void main(String[] args) {
        // System.out.println();
        System.out.println(scrambleWord(""));
        // BARCADABRA
    }

    public static String scrambleWord(String word) {
        String str = "";
        for (int i = 0; i < word.length() - 1; i++) {
            if (word.substring(i, i+1).equals("A") && !word.substring(i+1, i+2).equals("A")) {
                str += word.substring(i+1, i+2);
                str += word.substring(i, i+1);
                i++;
            }
            else {
                str += word.substring(i, i+1);
            }
        }
        if (!word.substring(word.length() - 2, word.length() - 1).equals("A")) { // if the last character
            // isn't preceded by an "a"
            str += word.substring(word.length() - 1, word.length()); // add the last char
        }
        return str;
    }
}
