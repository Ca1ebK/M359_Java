package U5_WritingClasses.ClassNotes;

public class Triangle {

    private int a;
    private int b;
    private int c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int calcPerimeter() {
        return a + b + c;
    }

    public double calcArea() {
        double s = (double) (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

}