package U5_WritingClasses.Homework;

public class AdditionPattern {

    private int currentNumber;
    private int startingNum;
    private int increment;

    public AdditionPattern(int startingNum, int increment) {
        this.startingNum = startingNum;
        this.increment = increment;
        this.currentNumber = startingNum;
    }

    public int currentNumber() {
        return this.currentNumber;
    }

    public void next() {
        this.currentNumber += this.increment;
    }

    public void prev() {
        if (currentNumber > startingNum) {
            currentNumber -= increment;
        }
    }
}
