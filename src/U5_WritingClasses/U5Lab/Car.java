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
     * This method simulates a race between the two cars and prints the winner
     * @param car1 a car that is going to race
     * @param car2 the other car that is going to race
     * @param track the track of the race
     */
    public static void race(Car car1, Car car2, Track track) {
        int car1d=0;
        int car2d=0;
        while(car1d<track.getDistance() && car2d< track.getDistance()){
            car1d+=track.getFriction()*(car1.getEngine().getMaxspd()*Math.random()+1);
            System.out.println(car1.getModel() + " distance: " + car1d);
            car2d+=track.getFriction()*(car2.getEngine().getMaxspd()*Math.random()+1);
            System.out.println(car2.getModel() + " distance: " + car2d);
        }
        if(car1d>car2d){
            System.out.println("The winner is: " + car1.getModel());
        }
        else {
            System.out.println("The winner is: " + car2.getModel());
        }
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
