package U5_WritingClasses.Homework;

public class PasswordGenerator {

    private int numDigits;
    private String prefix;
    public static int numPws;

    public PasswordGenerator(int numDigits, String prefix) {
        this.numDigits = numDigits;
        this.prefix = prefix;
        numPws = 0;
    }

    public PasswordGenerator(int numDigits) {
        this.numDigits = 6;
        prefix = "A";
    }

    public int pwCount() {
        return numPws;
    }

    public String pwGen() {
        String pw = "";
        pw += prefix + ".";
        for (int i = 0; i < numDigits; i++) {
            int randNum = (int) (Math.random() * 10);
            pw += randNum;
        }
        numPws++;
        return pw;
    }

}