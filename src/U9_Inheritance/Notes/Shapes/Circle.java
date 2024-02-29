package U9_Inheritance.Notes.Shapes;

public class Circle extends Shape {
    private double radius;
    public Circle(String name, String color, double radius) {
        super(name, color);
        this.radius = radius;
    }

    public String toString() {
        String str = "";
<<<<<<< HEAD
        str += "A " + getColor() + " Circle with radius: " + getRadius()    ;
=======
        str += "A " + getColor() + " " + getName() + " with radius: " + getRadius();
>>>>>>> 68abbba652db56491ebb44c394f7cfe816ab3bec
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
