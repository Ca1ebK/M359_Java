package U5_WritingClasses.ClassNotes;

public class Test {
    public static int countWords(String str) {
        int loc = str.indexOf(" ");
        String spaces = "";
        while (loc != -1) {
            spaces += str.charAt(loc);
            str = str.substring(loc + 1);
            // loc = str.indexOf(" ");
        }
        return spaces.length() + 1;
    }

    public static void main(String[] args) {
        System.out.println(countWords("This is a Java Test"));
    }
}
