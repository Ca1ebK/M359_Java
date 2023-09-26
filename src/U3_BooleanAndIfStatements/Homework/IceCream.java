package U3_BooleanAndIfStatements.Homework;

public class IceCream {
    private String flavor;
    private int numScoops;
    private boolean inCone;

    public IceCream(String flavor, int numScoops, boolean inCone) {
        this.flavor = flavor;
        this.numScoops = numScoops;
        this.inCone = inCone;
    }

    // two IceCream objects are equal if ALL variables are the same
    public boolean equals(IceCream other) {
        return (flavor.equals(other.flavor) && numScoops == other.numScoops && inCone == other.inCone);
    }


    // two IceCream objects are compared based on the number of scoops.
    // a cone with less scoops is considered to come "before" a cone with
    // more scoops
    public int compareTo(IceCream other) {

        return this.numScoops - other.numScoops;

        /*
        if (numScoops < other.numScoops) {
            return -1;
        }
        else if (numScoops > other.numScoops) {
            return 1;
        }
        else {
            return 0;
        }
         */

    }

}
