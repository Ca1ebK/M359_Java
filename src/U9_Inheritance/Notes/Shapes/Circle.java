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

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
