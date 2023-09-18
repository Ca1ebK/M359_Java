package U2_ClassesAndObjects.ClassNotes;

/*
The purpose of this class is to create instances of the
Student class and test the code that we wrote

THIS is where we will use psvm to actually run the code
 */

public class StudentTester {
    public static void main(String[] args) {
        Student nate = new Student("Nate Hinkle", 111111, 11);
        Student aubrey = new Student("Aubrey Denna", 222222);
        nate.printStudentInfo();
        aubrey.printStudentInfo();
    }
}
