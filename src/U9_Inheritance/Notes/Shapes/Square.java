package U9_Inheritance.Notes.Shapes;

public class Square extends Rectangle {
    public Square(String name, String color, double side) {
        super(name, color, side, side);
    }
    public String toString() {
        String str = "";
        str += "A " + getColor() + " Square with side: " + getLength();
        return str;
    }

    // You don't need this method! Nor do you need the scale method for this class since
    // Java references the methods from the rectangle class
//    public double findArea() {
//        return getLength() * getLength();
//    }
}
