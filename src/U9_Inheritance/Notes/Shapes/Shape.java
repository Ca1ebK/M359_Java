package U9_Inheritance.Notes.Shapes;

public class Shape {
    private String name;
    private String color;

    public Shape(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String toString() {
        String str = "";
        str += "A " + color + " " + " Shape";
        return str;
    }

    public String getColor() {
        return color;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
