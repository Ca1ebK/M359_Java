package U7_ArrayLists.ClassNotes;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        // System.out.println();
//        System.out.println(scrambleWord("ABRACADABRA"));
        // BARCADABRA

    }

    public static String scrambleWord(String word) {
        String str = "";
        for (int i = 0; i < word.length(); i++) {
            if (word.substring(i, i+1).equals("A") && !word.substring(i+1, i+2).equals("A")) {
                str += word.substring(i+1, i+2);
                str += word.substring(i, i+1);
                i++;
            }
            else {
                str += word.substring(i, i+1);
            }
        }

        return str;
    }

    public static void scrambleOrRemove(ArrayList<String> wordList) {

        for (int i = wordList.size() - 1; i >= 0; i--) {
            if (scrambleWord(wordList.get(i)).equals(wordList.get(i))) {
                wordList.remove(i);
            }
            else {
                wordList.set(i, scrambleWord(wordList.get(i)));
            }
        }

    }
}
