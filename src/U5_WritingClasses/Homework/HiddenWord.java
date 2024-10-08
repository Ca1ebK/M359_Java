package U5_WritingClasses.Homework;

public class HiddenWord {

    private String hiddenWord = "";

    public HiddenWord(String hiddenWord) {
        this.hiddenWord = hiddenWord;
    }

    public String getHint(String guess) {

        String hint = "";

        for (int i = 0; i < guess.length(); i++) {
            char letter = guess.charAt(i);
            if (letter == hiddenWord.charAt(i)) {
                hint += letter;
            }
            else if (hiddenWord.indexOf(letter) != -1) {
                hint += "+";
            }
            else {
                hint += "*";
            }
        }

        return hint;
    }

}
