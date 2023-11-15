/*
Caleb Kang, Pranaav Senthilkumar
Mrs. Denna
8th period

Purpose: to create a car's engine with a max speed and engine type

 */

package U5_WritingClasses.U5Lab;

public class Engine {
    private int maxspd;
    private String type;
    public Engine(int m, String t) {
        type = t;
        maxspd = m;
    }

    /**
     * Description: When an engine object is printed, format it nicely
     * @return return the max speed
     */
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
