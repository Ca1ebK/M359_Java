package U5_WritingClasses.U5Lab;

import static U5_WritingClasses.U5Lab.Car.race;

public class CarTester {

    public static void main(String[] args) {
        Engine v12 = new Engine(221, "v12");
        Car lambo = new Car(v12, "Aventador", "Yellow");

        Engine w16 = new Engine(221, "w16");
        Car bugatti = new Car(w16, "Veyron", "Black");

        Track Indy1000 = new Track("Racetrack", 1.25, 1000);

        race(lambo, bugatti, Indy1000);
    }

    /**
     * This method changes the speed of the given car.
     * @param car1 The car that is being upgraded
     */

    public static void upgrade(Car car1){
        int num = (int) (6*Math.random());

        int maxSpeed = car1.getEngine().getMaxspd();

        if (num == 0 && maxSpeed >= 6) {
            car1.getEngine().setMaxspd(maxSpeed-6);
            System.out.println("The car's engine breaks. It won't be as fast anymore. \nPerhaps you shouldn't have tried your luck.");
        }
        else {
            car1.getEngine().setMaxspd(maxSpeed + num);
            System.out.println("Success! The car is faster!");
        }

        maxSpeed = car1.getEngine().getMaxspd(); // update maxSpeed
        System.out.println("The car's new max speed is: " + maxSpeed);
    }

}
