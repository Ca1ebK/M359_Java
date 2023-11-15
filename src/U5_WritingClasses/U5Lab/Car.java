/*
Caleb Kang, Pranaav Senthilkumar
Mrs. Denna
8th period

Purpose: to create a car object with an engine, model, and color

*/

package U5_WritingClasses.U5Lab;

public class Car {
    private Engine engine;
    private String model = "";
    private String color = "";

    private static int numCars = 0;

    public Car(Engine engine, String model, String color) {
        this.engine = engine;
        this.model = model;
        this.color = color;
        numCars++;
    }

    /**
     * Description: When a car object is printed, format it nicely
     * @return return the engine, model, and color
     */
    public String toString() {
        return engine
                + "Model: " + model + "\n"
                + "Color: " + color + "\n";
    }

    public Engine getEngine() {
        return engine;
    }
    public void setEngine(Engine engine) {
        this.engine = engine;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public static int getNumCars() {
        return numCars;
    }
}
