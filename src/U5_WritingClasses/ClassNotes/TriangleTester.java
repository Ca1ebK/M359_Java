package U5_WritingClasses.ClassNotes;

public class TriangleTester {
    public static void main(String[] args) {
        Triangle t1 = new Triangle(2, 3, 4);
        System.out.println(t1.calcPerimeter());
        System.out.println(t1.calcArea());
    }
}
