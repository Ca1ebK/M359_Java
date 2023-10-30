package U5_WritingClasses.ClassNotes;

public class Test {
    public static String mirrorEnds(String string) {
        String reverseString = "";
        String newString = "";
        for (int i = string.length() - 1; i >= 0; i--) {
            reverseString += string.charAt(i);
            for (int j = 0; j < string.length(); j++) {
                if (reverseString.equals(string.substring(0, j))) {
                    newString += string.charAt(i);
                }
            }
        }

        return newString;
    }

    public static String notReplace(String str) {

        String newStr = "";

        for (int i = 0; i < str.length(); i++) {
//            char myChar = str.charAt(i);
//
//            if (Character.isLetter(myChar)) {
//                newStr += "True";
//            }
            if (str.substring(0, i).equals("is")) {
                newStr += "True";
            }
            for (int j = i + 1; j < str.length() - i; j++) {
                char myChar = str.charAt(j);
                if (Character.isLetter(myChar)) {
                    newStr += "False";
                }
            }
        }

        return newStr;
    }


    public static void main(String[] args) {
        // System.out.println(mirrorEnds("abXYZba"));
        System.out.println(notReplace("isis"));
    }
}
