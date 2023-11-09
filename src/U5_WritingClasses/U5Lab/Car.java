package U5_WritingClasses.U5Lab;

public class Car {
    private Engine engine;
    private String model = "";
    private String color = "";

    public static int numCars = 0;

    public Car(Engine engine, String model, String color) {
        this.engine = engine;
        this.model = model;
        this.color = color;
        numCars++;
    }

    /**
     * When a car object is printed, format it nicely
     * @return return the engine, model, and color
     */
    public String toString() {
        return engine
                + "Model: " + model + "\n"
                + "Color: " + color + "\n";
    }

    /**
     * get method for the engine
     * @return the car's engine
     */
    public Engine getEngine() {
        return engine;
    }

    /**
     * set method for the engine
     * @param engine the engine for the car
     */
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    /**
     * get method for the car's model
     * @return the car's model
     */
    public String getModel() {
        return model;
    }

    /**
     * set method for the engine
     * @param model the car's model
     */
    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }



}
