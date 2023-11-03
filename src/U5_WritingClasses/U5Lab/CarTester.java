package U5_WritingClasses.U5Lab;

public class CarTester {

    public static void main(String[] args) {
        Engine v12 = new Engine(221, "v12");
        Car lambo = new Car(v12, "Aventador", "Yellow");

        Engine w16 = new Engine(221, "w16");
        Car bugatti = new Car(w16, "Veyron", "Black");

        Track Indy1000=new Track("Racetrack", 1.25, 1000);

        //race(lambo, bugatti, Indy1000);
        upgrade(lambo);
    }

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

    /*
    Method 2
    .upgrade(car1)
    Random number from 0 to 5 chosen, if 0, lower car’s maxspeed by 6, else increase by number on die
     */

    public static void upgrade(Car car1){
        int num = (int) (6*Math.random());

        int maxSpeed = car1.getEngine().getMaxspd();

        if (num == 0 && maxSpeed >= 6) {
            car1.getEngine().setMaxspd(maxSpeed-6);
            System.out.println("The car's engine breaks. It won't be as fast anymore. \n Perhaps you shouldn't have tried your luck.");
        }
        else {
            car1.getEngine().setMaxspd(maxSpeed + num);
            System.out.println("Success! The car is faster!");
        }
    }

}
