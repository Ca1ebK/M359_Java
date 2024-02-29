package U9_Inheritance.Notes.Shapes;

public class Circle extends Shape {
    private double radius;
    public Circle(String name, String color, double radius) {
        super(name, color);
        this.radius = radius;
    }

    public String toString() {
        String str = "";
        str += "A " + getColor() + " " + getName() + " with radius: " + getRadius();
        return str;
    }

    public double findArea() {
        return Math.PI * radius * radius;
    }

    public void scaleSize(double scale) {
        radius *= scale;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
