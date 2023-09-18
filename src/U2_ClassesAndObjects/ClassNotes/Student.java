package U2_ClassesAndObjects.ClassNotes;

/*
This Student class represents a high school student who has
a name, an ID, and year in school (9-12)
 */

public class Student {
    private String name;
    private int id;
    private int schoolYear;

    // first constructor takes name and id and ASSUMES the student
    // is a freshman (9)

    public Student(String aName, int anID){
        name = aName;
        id = anID;
        schoolYear = 9; // default value
    }

    // second constructor also has a parameter for their schoolyear
    public Student(String aName, int anID, int aSchoolYear){
        name = aName;
        id = anID;
        schoolYear = aSchoolYear;
    }

    /*
    this method will nicely display all student data using print lines
    Because the instance variables have global scope, I can directly
    access them anywhere in this Student.java file
     */
    public void printStudentInfo() {
        System.out.println("Student name:\t" + name);
        System.out.println("ID:\t\t\t\t" + id);
        System.out.println("Year in school:\t" + schoolYear);
    }

}
