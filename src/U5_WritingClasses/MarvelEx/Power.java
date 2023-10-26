package U5_WritingClasses.MarvelEx;

public class Power {
    private String name;
    private int power;  // 1-10 best

    public Power(String name, int power) {
        this.name = name;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

}
