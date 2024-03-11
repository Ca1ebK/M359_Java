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
        str += "A " + getColor() + " rectangle with sides: " + length + " and  " + width;
        return str;
    }

    public double findArea() {
        return length * width;
    }

    public void scaleSize(double scale) {
        length *= scale;
        width *= scale;
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
