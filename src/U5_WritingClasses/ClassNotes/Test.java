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

        String result = "";
        int len = str.length();

        for (int i = 0; i < len; i++) {

            // adding anything that doesn't qualify
            if (i > 0 && Character.isLetter(str.charAt(i-1)) || i+2 < len && Character.isLetter(str.charAt(i+2))) {
                result += str.charAt(i);
            }
            else if (i < len && str.substring(i, i+2).equals("is")) {
                result += "is not";
                i++;
            }
            else {
                result += str.charAt(i);
            }

        }

        return result;

    }



    public static void main(String[] args) {
        // System.out.println(mirrorEnds("abXYZba"));
        System.out.println(notReplace("is test"));
    }
}
