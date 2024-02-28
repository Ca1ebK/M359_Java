package U9_Inheritance.Notes.Shapes;

public class Rectangle extends Shape {
    private double length;
    private double width;
    public Rectangle(String name, String color, double length, double width) {
        super(name, color);
        this.length = length;
        this.width = width;
    }

    public String toString() {
        String str = "";
        str += "A " + getColor() + " Rectangle with length: " + getLength() + " and width: " + getWidth();
        return str;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
