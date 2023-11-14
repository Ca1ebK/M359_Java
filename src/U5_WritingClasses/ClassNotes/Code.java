package U5_WritingClasses.ClassNotes;

public class Code {
    private String myCode;
    //additional instance variables
    private String tempString;

    public Code(String code){
        myCode = code;
        tempString = code;
    }

    public String getCode(){
        return myCode;
    }

    // precondition: p1 >= 0, p1 < p2
    //			  p2 <= myCode.length()
    // Replaces the characters in the code starting at
    // position p1 until position p2-1 inclusive with an X

    public void hide(int p1, int p2){
            int len = p2 - p1;
            String newString = "";
            for (int i = 0; i < len; i++) {
                newString += "X";
            }
            myCode = myCode.substring(0, p1) + newString + myCode.substring(p1 + len);
    }


    // precondition: p1 >= 0, p1 < p2,
    //  			  p2 <= myCode.length()
    // Restores to their original values the character in
    // the code starting at position p1 until position
    // p2-1 inclusive

    public void recover(int p1, int p2){
        int len = p2 - p1;
        String newString = "";
        for (int i = p1; i < p2; i++) {
            newString += tempString.charAt(i);
        }
        myCode = myCode.substring(0, p1)
                + newString
                + myCode.substring(p1 + len);
    }
}
