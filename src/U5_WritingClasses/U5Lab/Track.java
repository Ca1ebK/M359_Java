/*
Caleb Kang, Pranaav Senthilkumar
Mrs. Denna
8th period

Purpose: to create a track object with a type, friction, and distance

 */

package U5_WritingClasses.U5Lab;

public class Track {
    private String type;
    private double friction;
    private int distance;
    private static int numTracks = 0;
    public Track(String t, double f, int d){
        type=t;
        friction=f;
        distance=d;
        numTracks++;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getFriction() {
        return friction;
    }

    public void setFriction(double friction) {
        this.friction = friction;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public static int getNumTracks() {
        return numTracks;
    }
}
