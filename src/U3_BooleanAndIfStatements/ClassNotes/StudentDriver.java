package U3_BooleanAndIfStatements.ClassNotes;

/*
This class will have the main method
This is where I will create a few Student
objects to test my Student class code
 */

public class StudentDriver {
    public static void main(String[] args) {
        Student s1 = new Student("Caleb", "Kang", 111);
        Student s2 = new Student("Levyn", "Mathew", 222);
        Student s3 = new Student("Caleb", "Kang", 333);

        System.out.println(s1.equals(s2)); // false
        System.out.println(s1.equals(s3)); // true

        Student s4 = new Student("Ben", "Mathew", 444);
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s3));
        System.out.println(s2.compareTo(s4));
    }
}
