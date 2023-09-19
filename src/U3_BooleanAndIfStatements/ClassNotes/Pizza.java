package U3_BooleanAndIfStatements.ClassNotes;

// class header
public class Pizza {
    // private instance variables
    private String store;
    private int inches;
    private int numToppings;
    private boolean isDeepDish;

    // constructor
    public Pizza(String store, int inches, int numToppings, boolean isDeepDish) {
        this.store = store;
        this.inches = inches;
        this.numToppings = numToppings;
        this.isDeepDish = isDeepDish;
    }

    public Pizza(String store, int inches, boolean isDeepDish) {
        this.store = store;
        this.inches = inches;
        this.isDeepDish = isDeepDish;
        this.numToppings = 0;
    }

    /*
    toString method
    This method is called AUTOMATICALLY when we print an object
    reference. If we DON'T have the toString method created,
    then Java will just print the address in memory where the
    reference variable is saved.

    Method header MUST BE as follows:
    public String toString()
     */

    public String toString() {
        String str = "";

        // build up my String that describes a Pizza object
        str += "Ordered a " + inches + "in pizza from " + store;
        str += "\nIt has " + numToppings + " toppings";

        return str;
    }

    // equals method
    // store doesn't have to be the same
    // inches, numToppings, deepdish MUST be the same
    // This method MUST return a boolean and does NOT print anything
    // The method takes ONE parameter that is the same type as the class (Pizza)

    public boolean equals(Pizza other) {
        // check if inches, numToppings, and deepdish are the same
            // if they are, return true
            // if ANY are not the same, return false

//        if (this.inches != other.inches) {
//            return false;
//        }
//        else if (this.numToppings != other.numToppings) {
//            return false;
//        }
//        else if (this.isDeepDish != other.isDeepDish) {
//            return false;
//        }
//        else {
//            return true;
//        }
        if (this.isDeepDish == other.isDeepDish &&
            this.inches == other.inches &&
            this.numToppings == other.numToppings) {
            return true;
        }
        else {
            return false;
        }
    }




    // get/set methods

    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store;
    }

    public int getInches() {
        return inches;
    }

    public void setInches(int inches) {
        this.inches = inches;
    }

    public int getNumToppings() {
        return numToppings;
    }

    public void setNumToppings(int numToppings) {
        this.numToppings = numToppings;
    }

    public boolean isDeepDish() {
        return isDeepDish;
    }

    public void setDeepDish(boolean deepDish) {
        isDeepDish = deepDish;
    }
}
