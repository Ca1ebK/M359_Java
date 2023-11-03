package U5_WritingClasses.U5Lab;

public class Engine {
    private int maxspd;
    private String type;
    public Engine(int m, String t) {
        type = t;
        maxspd = m;
    }

    @Override
    public String toString() {
        return "ENGINE:\n" +
                "\tMax speed: " + maxspd + " mph\n" +
                "\tEngine type: " + type + "\n";
    }

    public int getMaxspd() {
        return maxspd;
    }

    public void setMaxspd(int maxspd) {
        this.maxspd = maxspd;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
