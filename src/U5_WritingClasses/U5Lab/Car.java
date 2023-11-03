package U5_WritingClasses.U5Lab;

public class Car {
    private Engine engine;
    private String model = "";
    private String color = "";

    public Car(Engine engine, String model, String color) {
        this.engine = engine;
        this.model = model;
        this.color = color;
    }

    @Override
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
}
